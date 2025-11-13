/**
 * Frama-C API - JavaScript/Node.js Examples
 * 
 * NO MANUAL PARSING NEEDED!
 * Just use fetch() or axios with regular strings - they handle encoding automatically.
 */

// ============================================
// Method 1: Using fetch (Built-in, Modern Browsers & Node.js 18+)
// ============================================

/**
 * Example 1: Send code as JSON using fetch
 * ✅ RECOMMENDED for browser and modern Node.js
 */
async function analyzeCodeWithFetch(code, analysisType = 'basic', mainFunction = 'main') {
    const apiUrl = 'http://localhost:5000/framac_analysis';
    
    try {
        const response = await fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({  // JSON.stringify handles ALL encoding automatically!
                code: code,  // Just pass the string as-is, no manual escaping needed
                analysis_type: analysisType,
                main_function: mainFunction
            })
        });

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const result = await response.json();
        
        console.log('✅ Analysis Success:', result.success);
        console.log('Analysis Type:', result.analysis_type);
        console.log('Main Function:', result.main_function);
        console.log('\nResult:');
        console.log(result.result);
        
        return result;
        
    } catch (error) {
        console.error('❌ Error:', error.message);
        throw error;
    }
}

// ============================================
// Method 2: Using axios (Popular HTTP library)
// ============================================

/**
 * Example 2: Send code as JSON using axios
 * ✅ RECOMMENDED for Node.js projects
 * 
 * Install: npm install axios
 */
async function analyzeCodeWithAxios(code, analysisType = 'basic', mainFunction = 'main') {
    const axios = require('axios');
    const apiUrl = 'http://localhost:5000/framac_analysis';
    
    try {
        const response = await axios.post(apiUrl, {
            // axios automatically stringifies and sets Content-Type!
            code: code,  // No manual parsing needed!
            analysis_type: analysisType,
            main_function: mainFunction
        });

        const result = response.data;
        
        console.log('✅ Analysis Success:', result.success);
        console.log('Analysis Type:', result.analysis_type);
        console.log('Main Function:', result.main_function);
        console.log('\nResult:');
        console.log(result.result);
        
        return result;
        
    } catch (error) {
        console.error('❌ Error:', error.response?.data || error.message);
        throw error;
    }
}

// ============================================
// Method 3: File Upload with FormData
// ============================================

/**
 * Example 3: Upload a file using FormData
 * ✅ BEST for file uploads in browsers
 */
async function uploadFileForAnalysis(file, analysisType = 'basic', mainFunction = 'main') {
    const apiUrl = 'http://localhost:5000/framac_analysis_file';
    
    const formData = new FormData();
    formData.append('file', file);  // file is a File object from <input type="file">
    formData.append('analysis_type', analysisType);
    formData.append('main_function', mainFunction);
    
    try {
        const response = await fetch(apiUrl, {
            method: 'POST',
            body: formData  // Don't set Content-Type header - browser does it automatically!
        });

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const result = await response.json();
        
        console.log('✅ Analysis Success:', result.success);
        console.log('\nResult:');
        console.log(result.result);
        
        return result;
        
    } catch (error) {
        console.error('❌ Error:', error.message);
        throw error;
    }
}

// ============================================
// Node.js: Read file from filesystem
// ============================================

/**
 * Example 5: Read a file and analyze it (Node.js)
 */
async function analyzeFileFromDisk(filePath, analysisType = 'basic', mainFunction = 'main') {
    const fs = require('fs').promises;
    
    try {
        // Read the file
        const code = await fs.readFile(filePath, 'utf8');
        
        console.log(`📁 Read file: ${filePath} (${code.length} characters)`);
        
        // Analyze it (using fetch or axios)
        const result = await analyzeCodeWithFetch(code, analysisType, mainFunction);
        
        return result;
        
    } catch (error) {
        console.error('❌ Error reading or analyzing file:', error.message);
        throw error;
    }
}

// ============================================
// Node.js: Upload file directly
// ============================================

/**
 * Example 6: Upload file using Node.js (with form-data package)
 * Install: npm install form-data axios
 */
async function uploadFileFromDiskNodeJS(filePath, analysisType = 'basic', mainFunction = 'main') {
    const fs = require('fs');
    const FormData = require('form-data');
    const axios = require('axios');
    
    const apiUrl = 'http://localhost:5000/framac_analysis_file';
    
    try {
        const formData = new FormData();
        formData.append('file', fs.createReadStream(filePath));
        formData.append('analysis_type', analysisType);
        formData.append('main_function', mainFunction);
        
        const response = await axios.post(apiUrl, formData, {
            headers: formData.getHeaders()  // Important for Node.js!
        });

        const result = response.data;
        
        console.log('✅ Analysis Success:', result.success);
        console.log('\nResult:');
        console.log(result.result);
        
        return result;
        
    } catch (error) {
        console.error('❌ Error:', error.response?.data || error.message);
        throw error;
    }
}

// ============================================
// USAGE EXAMPLES
// ============================================

// Example: Analyze a simple code snippet
const simpleCode = `int main() { 
    return 0; 
}`;

// Example: Analyze Arduino code with special characters and newlines
const arduinoCode = `#include <stdio.h>
#include <stdbool.h>

// Simple LED state simulator
bool ledState = false;
int sensorValue = 0;

// Simulate pinMode
void pinMode(int pin, int mode) {
    printf("Pin %d configured as %s\\n", pin, mode == 1 ? "OUTPUT" : "INPUT");
}

// Simulate digitalWrite
void digitalWrite(int pin, int value) {
    ledState = (value == 1);
    printf("Pin %d set to %s\\n", pin, ledState ? "HIGH" : "LOW");
}

int main() {
    printf("=== Arduino Simulator Starting ===\\n");
    pinMode(13, 1);
    digitalWrite(13, 1);
    return 0;
}`;

// Run examples (uncomment to test)
async function runExamples() {
    console.log('========================================');
    console.log('Frama-C API - JavaScript Examples');
    console.log('========================================\n');

    // Test 1: Simple code with fetch
    console.log('Test 1: Simple code with fetch');
    await analyzeCodeWithFetch(simpleCode);
    
    console.log('\n----------------------------------------\n');
    
    // Test 2: Arduino code with fetch (handles newlines, special chars automatically!)
    console.log('Test 2: Arduino code with fetch');
    await analyzeCodeWithFetch(arduinoCode, 'basic', 'main');
    
    console.log('\n----------------------------------------\n');
    
    // Test 3: File upload from disk (Node.js only)
    // Uncomment for Node.js:
    // console.log('Test 3: Upload file from disk');
    // await uploadFileFromDiskNodeJS('./test_arduino.c', 'basic', 'main');
}

// ============================================
// BROWSER INTEGRATION EXAMPLE
// ============================================

/**
 * Example 7: Complete browser integration with file input
 * Add this to your HTML page
 */
function setupBrowserFileUpload() {
    const html = `
    <!DOCTYPE html>
    <html>
    <head>
        <title>Frama-C Analysis</title>
        <style>
            body { font-family: Arial, sans-serif; max-width: 800px; margin: 50px auto; padding: 20px; }
            .container { border: 1px solid #ccc; padding: 20px; border-radius: 5px; }
            textarea { width: 100%; height: 200px; font-family: monospace; }
            button { background: #007bff; color: white; padding: 10px 20px; border: none; cursor: pointer; }
            button:hover { background: #0056b3; }
            .result { margin-top: 20px; padding: 10px; background: #f5f5f5; white-space: pre-wrap; }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Frama-C Code Analysis</h1>
            
            <h3>Method 1: Paste Code</h3>
            <textarea id="codeInput" placeholder="Paste your C/C++ code here...">#include <stdio.h>

int main() {
    printf("Hello World\\n");
    return 0;
}</textarea>
            <br><br>
            <button onclick="analyzeCode()">Analyze Code</button>
            
            <h3>Method 2: Upload File</h3>
            <input type="file" id="fileInput" accept=".c,.cpp,.h,.hpp">
            <button onclick="analyzeFile()">Analyze File</button>
            
            <div id="result" class="result" style="display:none;"></div>
        </div>

        <script>
            async function analyzeCode() {
                const code = document.getElementById('codeInput').value;
                const resultDiv = document.getElementById('result');
                
                resultDiv.style.display = 'block';
                resultDiv.innerHTML = 'Analyzing...';
                
                try {
                    const response = await fetch('http://localhost:5000/framac_analysis', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/json',
                        },
                        body: JSON.stringify({
                            code: code,  // NO PARSING NEEDED!
                            analysis_type: 'basic',
                            main_function: 'main'
                        })
                    });
                    
                    const result = await response.json();
                    
                    if (result.success) {
                        resultDiv.innerHTML = '✅ Analysis completed!\\n\\n' + result.result;
                    } else {
                        resultDiv.innerHTML = '❌ Analysis failed:\\n\\n' + result.result;
                    }
                } catch (error) {
                    resultDiv.innerHTML = '❌ Error: ' + error.message;
                }
            }
            
            async function analyzeFile() {
                const fileInput = document.getElementById('fileInput');
                const resultDiv = document.getElementById('result');
                
                if (!fileInput.files || fileInput.files.length === 0) {
                    alert('Please select a file first!');
                    return;
                }
                
                const file = fileInput.files[0];
                const formData = new FormData();
                formData.append('file', file);
                formData.append('analysis_type', 'basic');
                formData.append('main_function', 'main');
                
                resultDiv.style.display = 'block';
                resultDiv.innerHTML = 'Analyzing...';
                
                try {
                    const response = await fetch('http://localhost:5000/framac_analysis_file', {
                        method: 'POST',
                        body: formData
                    });
                    
                    const result = await response.json();
                    
                    if (result.success) {
                        resultDiv.innerHTML = '✅ Analysis completed!\\n\\n' + result.result;
                    } else {
                        resultDiv.innerHTML = '❌ Analysis failed:\\n\\n' + result.result;
                    }
                } catch (error) {
                    resultDiv.innerHTML = '❌ Error: ' + error.message;
                }
            }
        </script>
    </body>
    </html>
    `;
    
    return html;
}

// ============================================
// IMPORTANT NOTES
// ============================================

/**
 * KEY POINTS:
 * 
 * 1. ✅ NO MANUAL PARSING NEEDED!
 *    - JSON.stringify() handles all escaping automatically
 *    - Works with newlines, quotes, special characters, etc.
 * 
 * 2. ✅ Just pass the code string as-is:
 *    - Don't escape manually
 *    - Don't replace newlines
 *    - Don't encode special characters
 * 
 * 3. ✅ Choose the right method:
 *    - JSON POST: Best for APIs and text code
 *    - File Upload: Best for large files in browsers
 *    - FormData: Alternative when needed
 * 
 * 4. ✅ Error handling:
 *    - Always check response.ok or catch errors
 *    - Check result.success field
 *    - Display result.result for output
 * 
 * 5. ⚠️ CORS in browsers:
 *    - If calling from a different domain, server needs CORS headers
 *    - For local testing, run from same origin or use CORS proxy
 */

// Export functions for use in other modules
if (typeof module !== 'undefined' && module.exports) {
    module.exports = {
        analyzeCodeWithFetch,
        analyzeCodeWithAxios,
        uploadFileForAnalysis,
        analyzeFileFromDisk,
        uploadFileFromDiskNodeJS,
        setupBrowserFileUpload
    };
}
