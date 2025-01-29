## Repository with the IoMT modeling tools.

## Quick install and run


### Build Execution steps

This command will run all the services. It also constructs the images if they are not previously built/

#### Set Github access

Set up the GitHub user name and access token. It is necessary just for building the images.

```
export GIT_USERNAME=<the user name>
export GIT_PASSWORD=<the github access token>
```

#### Building and running

```
cd papyrus-web
docker compose up
```

## Detailed instructions

Detailed installation instructions (using docker or scripts) are available in the papyrus-web folder.


