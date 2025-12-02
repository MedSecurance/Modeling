#!/usr/bin/env python3
"""
Frama-C REST API Server
Provides a REST API endpoint for running Frama-C analysis on C/C++ code
"""

import os
import tempfile
import subprocess
import shutil
import zipfile
import glob
from typing import Optional
from fastapi import FastAPI, File, UploadFile, Form, HTTPException, Body
from fastapi.responses import JSONResponse, PlainTextResponse
from pydantic import BaseModel, Field
import uvicorn

app = FastAPI(
    title="Frama-C Analysis API",
    description="REST API for running Frama-C static analysis on C/C++ code",
    version="1.0.0"
)

# Configuration
MAX_FILE_SIZE = 16 * 1024 * 1024  # 16MB

# Frama-C configuration
FRAMA_C_COMMAND = 'frama-c'
DEFAULT_ANALYSIS_OPTIONS = [
    '-eva',
    '-eva-slevel', '10',
    '-eva-warn-key', 'builtins:missing-spec=inactive'
]

# Arduino-specific options
ARDUINO_INCLUDE_PATHS = [
    '-I./avr-libc/include',
    '-I./ArduinoCore-avr/cores/arduino',
    '-I./ArduinoCore-avr/variants/standard',
]

ARDUINO_DEFINES = [
    '-D__AVR_ATmega328P__',
    '-DF_CPU=16000000L',
    '-DARDUINO=10607',
]

# Pydantic models for request/response
class AnalysisRequest(BaseModel):
    code: str = Field(..., description="C/C++ source code as text")
    analysis_type: str = Field(default="basic", description="Analysis type: basic, arduino, or custom")
    main_function: str = Field(default="main", description="Entry point function name")

class AnalysisResponse(BaseModel):
    success: bool
    result: str
    analysis_type: str
    main_function: str
    error: Optional[str] = None

class HealthResponse(BaseModel):
    status: str
    service: str

def allowed_file(filename: str) -> bool:
    """Check if file has allowed extension"""
    ALLOWED_EXTENSIONS = {'c', 'cpp', 'h', 'hpp'}
    return '.' in filename and \
           filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS


def format_output_as_markdown(output: str, success: bool, source_file: str, analysis_type: str, main_function: str) -> str:
    """
    Format Frama-C analysis output as Markdown
    
    Args:
        output: Raw Frama-C output
        success: Whether analysis was successful
        source_file: Path to analyzed file
        analysis_type: Type of analysis performed
        main_function: Entry point function
    
    Returns:
        Markdown-formatted output
    """
    # Get filename from path
    filename = os.path.basename(source_file)
    
    # Build markdown output
    md = []
    md.append("# Frama-C Analysis Report")
    md.append("")
    
    # Status badge
    if success:
        md.append("**Status:** - Analysis Completed")
    else:
        md.append("**Status:** - Analysis Failed")
    
    md.append("")
    md.append("## Analysis Configuration")
    md.append(f"- **File:** `{filename}`")
    md.append(f"- **Analysis Type:** `{analysis_type}`")
    md.append(f"- **Entry Point:** `{main_function}`")
    
    md.append("")
    md.append("## Analysis Output")
    md.append("```")
    md.append(output)
    md.append("```")
    
    # Parse output for key information
    if success:
        md.append("")
        md.append("## Summary")
        
        # Extract coverage info
        if "coverage" in output.lower():
            lines = output.split('\n')
            for line in lines:
                if 'function analyzed' in line.lower() or 'coverage' in line.lower():
                    md.append(f"- {line.strip()}")
        
        # Extract errors and warnings
        if "No errors or warnings" in output:
            md.append("")
            md.append("✅ **No errors or warnings raised during the analysis.**")
        
        # Extract alarms
        if "alarms generated" in output.lower():
            lines = output.split('\n')
            for line in lines:
                if 'alarm' in line.lower():
                    md.append(f"- {line.strip()}")
    
    return '\n'.join(md)


def run_framac_analysis(source_file, analysis_type='basic', main_function='main'):
    """
    Run Frama-C analysis on the given source file
    
    Args:
        source_file: Path to the C/C++ source file
        analysis_type: 'basic', 'arduino', or 'custom'
        main_function: Name of the main/entry function
    
    Returns:
        tuple: (success: bool, output: str)
    """
    try:
        # Build the command
        cmd = [FRAMA_C_COMMAND]
        
        # Add analysis type specific options
        if analysis_type == 'arduino':
            cmd.extend(['-cpp-extra-args', ' '.join(ARDUINO_INCLUDE_PATHS + ARDUINO_DEFINES)])
            cmd.extend(['-machdep', 'avr_8'])
            cmd.extend(['-kernel-warn-key', 'parser:drop-conflicting-spec=inactive'])
            cmd.extend(['-continue-annot-error'])
        
        # Add default analysis options
        cmd.extend(DEFAULT_ANALYSIS_OPTIONS)
        
        # Add main function
        if main_function:
            cmd.extend(['-main', main_function])
        
        # Add source file
        cmd.append(source_file)
        
        # Run Frama-C
        result = subprocess.run(
            cmd,
            capture_output=True,
            text=True,
            timeout=60  # 60 second timeout
        )
        
        # Combine stdout and stderr
        raw_output = result.stdout + result.stderr
        
        # Check if analysis completed (even with warnings)
        success = result.returncode == 0 or 'computing for function' in raw_output
        
        # Format output as Markdown
        markdown_output = format_output_as_markdown(raw_output, success, source_file, analysis_type, main_function)
        
        return success, markdown_output
        
    except subprocess.TimeoutExpired:
        error_msg = "Error: Analysis timed out after 60 seconds"
        markdown_output = format_output_as_markdown(error_msg, False, source_file, analysis_type, main_function)
        return False, markdown_output
    except Exception as e:
        error_msg = f"Error running Frama-C: {str(e)}"
        markdown_output = format_output_as_markdown(error_msg, False, source_file, analysis_type, main_function)
        return False, markdown_output


@app.post("/framac_analysis", response_class=PlainTextResponse, tags=["Analysis"])
async def framac_analysis_post(
    request: AnalysisRequest = Body(..., description="Analysis request with code as JSON body")
):
    """
    Frama-C Analysis Endpoint (POST with JSON Body)
    
    ✅ RECOMMENDED METHOD for programmatic access with large code files.
    
    Returns Markdown-formatted analysis report.
    
    Accepts JSON body with code field containing source code.
    Properly handles multi-line code, special characters, and encoding.
    
    Example using curl:
        curl -X POST http://localhost:5000/framac_analysis \\
          -H 'Content-Type: application/json' \\
          -d @- << 'EOF'
        {
          "code": "int main() { return 0; }",
          "analysis_type": "basic",
          "main_function": "main"
        }
        EOF

    """
    temp_file = None
    temp_dir = None
    
    try:
        # Create temporary directory and file
        temp_dir = tempfile.mkdtemp()
        
        # Determine file extension
        if 'extern "C"' in request.code or 'class ' in request.code or 'namespace ' in request.code:
            ext = '.cpp'
        else:
            ext = '.c'
        
        temp_file = os.path.join(temp_dir, f'source{ext}')
        # Write with explicit UTF-8 encoding and Unix line endings
        with open(temp_file, 'w', encoding='utf-8', newline='\n') as f:
            f.write(request.code)
        
        # Run Frama-C analysis (returns Markdown)
        success, markdown_output = run_framac_analysis(temp_file, request.analysis_type, request.main_function)
        
        # Return Markdown directly
        return PlainTextResponse(content=markdown_output, media_type="text/markdown")
        
    except Exception as e:
        error_md = f"# Error\n\n❌ **Server error:** {str(e)}"
        return PlainTextResponse(content=error_md, status_code=500, media_type="text/markdown")
        
    finally:
        # Clean up temporary files
        if temp_dir and os.path.exists(temp_dir):
            shutil.rmtree(temp_dir)


@app.post("/framac_analysis_file", response_class=PlainTextResponse, tags=["Analysis"], include_in_schema=True)
async def framac_analysis_file(
    file: UploadFile = File(..., description="C/C++ source file"),
    analysis_type: str = Form(default="basic", description="Analysis type: basic, arduino, or custom"),
    main_function: str = Form(default="main", description="Entry point function name")
):
    """
    Frama-C Analysis Endpoint (File Upload Only)
    
    ✅ RECOMMENDED METHOD for file uploads and command-line usage.
    
    Returns Markdown-formatted analysis report.
    
    Accepts C/C++ source file upload only.
    
    Example with file upload (curl):
        curl -X POST http://localhost:5000/framac_analysis_file \\
          -F 'file=@mycode.c' \\
          -F 'analysis_type=basic' \\
          -F 'main_function=main'

    """
    temp_file = None
    temp_dir = None
    
    try:
        # Validate file
        if not file.filename:
            error_md = "# Error\n\n❌ **No file selected**"
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        if not allowed_file(file.filename):
            error_md = "# Error\n\n❌ **Invalid file type.** Allowed: .c, .cpp, .h, .hpp"
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        # Check file size
        contents = await file.read()
        if len(contents) > MAX_FILE_SIZE:
            error_md = f"# Error\n\n❌ **File too large.** Max size: {MAX_FILE_SIZE / (1024*1024):.0f}MB"
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        # Save file
        temp_dir = tempfile.mkdtemp()
        temp_file = os.path.join(temp_dir, file.filename)
        # Binary mode for file uploads
        with open(temp_file, 'wb') as f:
            f.write(contents)
        
        # Run Frama-C analysis (returns Markdown)
        success, markdown_output = run_framac_analysis(temp_file, analysis_type, main_function)
        
        # Return Markdown directly
        return PlainTextResponse(content=markdown_output, media_type="text/markdown")
        
    except Exception as e:
        error_md = f"# Error\n\n❌ **Server error:** {str(e)}"
        return PlainTextResponse(content=error_md, status_code=500, media_type="text/markdown")
        
    finally:
        # Clean up temporary files
        if temp_dir and os.path.exists(temp_dir):
            shutil.rmtree(temp_dir)


def run_arduino_project_analysis(project_dir: str, source_file: str = None, timeout: int = 300) -> tuple:
    """
    Run Frama-C Arduino analysis using the project's run.sh script
    
    Args:
        project_dir: Path to the extracted Arduino project directory
        source_file: Optional source file to analyze (passed to run.sh)
        timeout: Timeout in seconds (default 5 minutes for Arduino analysis)
    
    Returns:
        tuple: (success: bool, markdown_output: str)
    """
    try:
        # Find run.sh script
        run_script = os.path.join(project_dir, 'run.sh')
        if not os.path.exists(run_script):
            # Try to find it in subdirectories
            for root, dirs, files in os.walk(project_dir):
                if 'run.sh' in files:
                    run_script = os.path.join(root, 'run.sh')
                    project_dir = root
                    break
        
        if not os.path.exists(run_script):
            error_msg = "Error: run.sh script not found in the uploaded zip"
            return False, format_arduino_output_as_markdown(error_msg, False, project_dir, source_file)
        
        # Make run.sh executable
        os.chmod(run_script, 0o755)
        
        # Build command
        cmd = ['bash', run_script]
        
        # Add source file if specified and not empty, otherwise look for common patterns
        if source_file and source_file.strip() and source_file.strip().lower() not in ('string', 'none', ''):
            cmd.append(source_file.strip())
        else:
            # Look for example.cpp, example.c, or *.ino files
            for pattern in ['example.cpp', 'example.c', '*.ino', '*.cpp', '*.c']:
                matches = glob.glob(os.path.join(project_dir, pattern))
                if matches:
                    # Filter out Arduino core sources
                    user_files = [f for f in matches if 'ArduinoCore' not in f and 'avr-libc' not in f]
                    if user_files:
                        cmd.append(os.path.basename(user_files[0]))
                        break
        
        # Run the analysis
        result = subprocess.run(
            cmd,
            cwd=project_dir,
            capture_output=True,
            text=True,
            timeout=timeout
        )
        
        # Combine stdout and stderr
        raw_output = result.stdout + result.stderr
        
        # Check if analysis completed
        success = result.returncode == 0 or 'computing for function' in raw_output or 'analyzed.sav' in raw_output
        
        # Format output as Markdown
        analyzed_file = cmd[-1] if len(cmd) > 2 else "Arduino project"
        markdown_output = format_arduino_output_as_markdown(raw_output, success, project_dir, analyzed_file)
        
        return success, markdown_output
        
    except subprocess.TimeoutExpired:
        error_msg = f"Error: Analysis timed out after {timeout} seconds"
        return False, format_arduino_output_as_markdown(error_msg, False, project_dir, source_file)
    except Exception as e:
        error_msg = f"Error running Arduino analysis: {str(e)}"
        return False, format_arduino_output_as_markdown(error_msg, False, project_dir, source_file)


def format_arduino_output_as_markdown(output: str, success: bool, project_dir: str, source_file: str = None) -> str:
    """
    Format Arduino Frama-C analysis output as Markdown
    """
    md = []
    md.append("# Frama-C Arduino Analysis Report")
    md.append("")
    
    # Status badge
    if success:
        md.append("**Status:** ✅ Analysis Completed")
    else:
        md.append("**Status:** ❌ Analysis Failed")
    
    md.append("")
    md.append("## Analysis Configuration")
    md.append(f"- **Project Directory:** `{os.path.basename(project_dir)}`")
    if source_file:
        md.append(f"- **Source File:** `{source_file}`")
    md.append(f"- **Analysis Type:** `arduino` (full Arduino project)")
    
    md.append("")
    md.append("## Analysis Output")
    md.append("```")
    md.append(output)
    md.append("```")
    
    # Parse output for key information
    if success:
        md.append("")
        md.append("## Summary")
        
        lines = output.split('\n')
        for line in lines:
            if any(keyword in line.lower() for keyword in ['function analyzed', 'coverage', 'alarm', 'warning', 'error']):
                md.append(f"- {line.strip()}")
        
        if "No errors or warnings" in output:
            md.append("")
            md.append("✅ **No errors or warnings raised during the analysis.**")
        
        if "analyzed.sav" in output or "saved" in output.lower():
            md.append("")
            md.append("📁 **Analysis results saved to `analyzed.sav`**")
    
    return '\n'.join(md)


@app.post("/framac_arduino_project", response_class=PlainTextResponse, tags=["Analysis"])
async def framac_arduino_project(
    file: UploadFile = File(..., description="ZIP file containing Arduino project with run.sh"),
    source_file: str = Form(default=None, description="Source file to analyze (optional, auto-detected if not specified)"),
    timeout: int = Form(default=300, description="Analysis timeout in seconds (default: 300)")
):
    """
    Frama-C Arduino Project Analysis Endpoint (ZIP Upload)
    
    ✅ For full Arduino project analysis with custom run.sh scripts.
    
    Returns Markdown-formatted analysis report.
    
    Upload a ZIP file containing:
    - run.sh: The analysis script
    - ArduinoCore-avr/: Arduino core libraries
    - avr-libc/: AVR libc headers
    - avr_8.yml: Machine description file
    - example.cpp (or your source file): The code to analyze
    
    The endpoint will:
    1. Extract the ZIP file
    2. Execute run.sh with the source file
    3. Return the analysis results
    
    Example with curl:
        curl -X POST http://localhost:5000/framac_arduino_project \\
          -F 'file=@arduino-project.zip' \\
          -F 'source_file=example.cpp' \\
          -F 'timeout=300'
    """
    temp_dir = None
    
    try:
        # Validate file
        if not file.filename:
            error_md = "# Error\n\n **No file selected**"
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        if not file.filename.lower().endswith('.zip'):
            error_md = "# Error\n\n **Invalid file type.** Only .zip files are allowed."
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        # Check file size (allow larger for ZIP files - 100MB)
        MAX_ZIP_SIZE = 100 * 1024 * 1024
        contents = await file.read()
        if len(contents) > MAX_ZIP_SIZE:
            error_md = f"# Error\n\n❌ **File too large.** Max size: {MAX_ZIP_SIZE / (1024*1024):.0f}MB"
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        # Create temporary directory
        temp_dir = tempfile.mkdtemp()
        zip_path = os.path.join(temp_dir, 'project.zip')
        
        # Save ZIP file
        with open(zip_path, 'wb') as f:
            f.write(contents)
        
        # Extract ZIP file
        extract_dir = os.path.join(temp_dir, 'project')
        os.makedirs(extract_dir, exist_ok=True)
        
        try:
            with zipfile.ZipFile(zip_path, 'r') as zip_ref:
                zip_ref.extractall(extract_dir)
        except zipfile.BadZipFile:
            error_md = "# Error\n\n❌ **Invalid ZIP file.** The uploaded file is not a valid ZIP archive."
            return PlainTextResponse(content=error_md, status_code=400, media_type="text/markdown")
        
        # Check if contents are in a subdirectory (common when zipping a folder)
        extracted_items = os.listdir(extract_dir)
        if len(extracted_items) == 1 and os.path.isdir(os.path.join(extract_dir, extracted_items[0])):
            extract_dir = os.path.join(extract_dir, extracted_items[0])
        
        # Run Arduino project analysis
        success, markdown_output = run_arduino_project_analysis(extract_dir, source_file, timeout)
        
        # Return Markdown directly
        return PlainTextResponse(content=markdown_output, media_type="text/markdown")
        
    except Exception as e:
        error_md = f"# Error\n\n❌ **Server error:** {str(e)}"
        return PlainTextResponse(content=error_md, status_code=500, media_type="text/markdown")
        
    finally:
        # Clean up temporary files
        if temp_dir and os.path.exists(temp_dir):
            shutil.rmtree(temp_dir)


@app.get('/health', response_model=HealthResponse, tags=["Health"])
async def health():
    """Health check endpoint"""
    return HealthResponse(
        status='healthy',
        service='Frama-C Analysis API'
    )


@app.get('/', tags=["Info"])
async def index():
    """API information endpoint"""
    return {
        'service': 'Frama-C Analysis API',
        'version': '1.0',
        'endpoints': {
            '/framac_analysis (POST)': {
                'method': 'POST',
                'description': '✅ RECOMMENDED: Run Frama-C analysis on C/C++ code via JSON body',
                'content_type': 'application/json',
                'parameters': {
                    'code': 'C/C++ source code as text',
                    'analysis_type': 'Analysis type: basic, arduino, custom (default: basic)',
                    'main_function': 'Entry point function name (default: main)'
                },
                'returns': {
                    'success': 'Boolean indicating if analysis completed',
                    'result': 'Analysis output text'
                }
            },
            '/framac_analysis_file (POST)': {
                'method': 'POST',
                'description': '✅ RECOMMENDED: Run Frama-C analysis with file upload',
                'content_type': 'multipart/form-data',
                'parameters': {
                    'file': 'C/C++ source file upload (required)',
                    'analysis_type': 'Analysis type: basic, arduino, custom (default: basic)',
                    'main_function': 'Entry point function name (default: main)'
                },
                'returns': {
                    'success': 'Boolean indicating if analysis completed',
                    'result': 'Analysis output text'
                }
            },
            '/framac_arduino_project (POST)': {
                'method': 'POST',
                'description': '🔧 Full Arduino project analysis with ZIP upload',
                'content_type': 'multipart/form-data',
                'parameters': {
                    'file': 'ZIP file containing Arduino project with run.sh (required)',
                    'source_file': 'Source file to analyze (optional, auto-detected)',
                    'timeout': 'Analysis timeout in seconds (default: 300)'
                },
                'zip_contents': {
                    'required': ['run.sh', 'ArduinoCore-avr/', 'avr-libc/', 'avr_8.yml'],
                    'optional': ['example.cpp', '*.ino', 'your source files']
                },
                'returns': {
                    'success': 'Boolean indicating if analysis completed',
                    'result': 'Analysis output in Markdown format'
                }
            },
            '/health': {
                'method': 'GET',
                'description': 'Health check endpoint'
            }
        },
        'examples': {
            'json_post': {
                'url': '/framac_analysis',
                'method': 'POST',
                'content_type': 'application/json',
                'body': {
                    'code': 'int main() { return 0; }',
                    'analysis_type': 'basic',
                    'main_function': 'main'
                }
            },
            'file_upload': {
                'url': '/framac_analysis_file',
                'method': 'POST',
                'content_type': 'multipart/form-data',
                'body': 'file=@source.cpp&analysis_type=basic'
            },
            'arduino_project': {
                'url': '/framac_arduino_project',
                'method': 'POST',
                'content_type': 'multipart/form-data',
                'body': 'file=@arduino-project.zip&source_file=example.cpp&timeout=300'
            }
        }
    }


if __name__ == '__main__':
    # Run the FastAPI app with Uvicorn
    uvicorn.run(
        app,
        host='0.0.0.0',
        port=5000,
        log_level='info'
    )
