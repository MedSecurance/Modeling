#!/bin/bash
# Start the Frama-C REST API server

echo "=== Starting Frama-C REST API Server ==="
echo ""
echo "API will be available at: http://0.0.0.0:5000"
echo "Endpoints:"
echo "  - POST /framac_analysis : Run Frama-C analysis"
echo ""

# Change to root directory (where Arduino files are)
cd /root

# Start the Flask API server
python3 /opt/framac-api/api_server.py
