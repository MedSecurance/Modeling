# Frama-C REST API

This folder contains the REST API server for running Frama-C analysis on C/C++ code.

## Files

- **api_server.py** - FastAPI REST API server implementation
- **requirements.txt** - Python dependencies
- **start_api.sh** - Startup script for the API server
- **javascript_examples.js** - JavaScript/Node.js usage examples

## Quick Start

### Building the Docker Image

```bash
cd ..
docker build -t frama-c-api:latest .
```

### Running the API Server

```bash
docker run -d -p 5000:5000 --name frama-c-api frama-c-api:latest
```

### API Endpoints

The API provides 2 main endpoints:

1. **POST `/framac_analysis`** - Analyze code via JSON
   - Send C/C++ code as JSON body
   - Best for programmatic access and JavaScript

2. **POST `/framac_analysis_file`** - Analyze code via file upload
   - Upload C/C++ source files
   - Best for command-line usage with curl

### Usage Examples

#### JavaScript (Browser/Node.js)

```javascript
// Using fetch
const response = await fetch('http://localhost:5000/framac_analysis', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({
        code: 'int main() { return 0; }',
        analysis_type: 'basic',
        main_function: 'main'
    })
});

const result = await response.json();
console.log(result);
```

See `javascript_examples.js` for complete examples.

#### Curl (File Upload)

```bash
curl -X POST http://localhost:5000/framac_analysis_file \
  -F 'file=@mycode.c' \
  -F 'analysis_type=basic' \
  -F 'main_function=main'
```

#### Python

```python
import requests

# Method 1: JSON
response = requests.post(
    'http://localhost:5000/framac_analysis',
    json={
        'code': 'int main() { return 0; }',
        'analysis_type': 'basic',
        'main_function': 'main'
    }
)

# Method 2: File upload
with open('mycode.c', 'rb') as f:
    response = requests.post(
        'http://localhost:5000/framac_analysis_file',
        files={'file': f},
        data={'analysis_type': 'basic'}
    )

result = response.json()
print(f"Success: {result['success']}")
print(result['result'])
```

## Interactive Documentation

Once the server is running, visit:
- Swagger UI: http://localhost:5000/docs
- ReDoc: http://localhost:5000/redoc

## Key Points

- ✅ **No manual parsing needed** for JavaScript - `JSON.stringify()` handles everything
- ✅ **UTF-8 encoding** properly handled for all special characters
- ✅ **File upload** supports files up to 16MB
- ✅ **Two analysis types**: `basic` (standard C/C++) and `arduino` (AVR-specific)

## Docker Container Management

```bash
# Stop the container
docker stop frama-c-api

# Start the container
docker start frama-c-api

# View logs
docker logs -f frama-c-api

# Remove the container
docker rm frama-c-api
```
