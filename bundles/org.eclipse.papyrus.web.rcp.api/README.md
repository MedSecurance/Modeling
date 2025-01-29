# Web server of the Papyrus Web API

This plug-in initiates a web server using the Javalin web server. The server listens to HTTP REST calls for model manipulation operations of Papyrus Web. 

It calls the specific services for each task. 

The API is exported using Swagger, following OpenAPI 3.0.x versions.

The RCP_SERVICE_PORT environment variable need to be set. It is the port to expose the web server.

## Requirements

 - receive GET calls based on an exposed model manipulation API
 - call the appropriate model manipulation services
 
