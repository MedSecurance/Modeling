#!/usr/bin/env python3
"""
Frama-C REST API Server
Provides a REST API endpoint for running Frama-C analysis on C/C++ code
"""

import os
import tempfile
import subprocess
import shutil
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
        md.append("**Status:** ✅ Analysis Completed")
    else:
        md.append("**Status:** ❌ Analysis Failed")
    
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
    
    Example using Python:
        import requests
        response = requests.post('http://localhost:5000/framac_analysis',
                                json={'code': code_string, 'analysis_type': 'basic'})
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
    
    Example with Python:
        import requests
        with open('mycode.c', 'rb') as f:
            response = requests.post(
                'http://localhost:5000/framac_analysis_file',
                files={'file': f},
                data={'analysis_type': 'basic', 'main_function': 'main'}
            )
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
