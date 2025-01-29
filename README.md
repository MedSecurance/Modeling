## Repository with the IoMT modeling tools.

## Quick install and run

### Build steps

To build the modelling services component:

```
cd pwebservices

docker build -t codegen_rcp -f dockerfiles/rcp/Dockerfile .
```

To build the IoMT modeling tool

First, it is necessary to create a Git Hub Personal Access Token. Then, execute the following command:

```
cd papyrus-web

docker build --build-arg USERNAME=<github user name> --build-arg PASSWORD=<git hub access token> --build-arg WEBAPP_VERSION=2024.2.1 -t papyrusweb -f backend/papyrus-web-application/Dockerfile.local .
```

### Execution steps

```
cd papyrus-web
docker compose -f backend/papyrus-web-application/docker-compose.yml up
```

## Detailed instructions

Detailed installation instructions (using docker or scripts) are available in the papyrus-web folder.


