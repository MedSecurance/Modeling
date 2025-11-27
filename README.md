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

### Step-by-step build
- [Detailed step-by-step build](./papyrus-web/README.adoc)
  
### Tool detailed documentation

The tool detailed documenation is [available here](./papyrus-web/doc/index.adoc). The documentation has the following items:
- **Use cases Howtos**: step-by-step guides for IoMT model create, TVRA model instantiation, IoMT with constraints model, code generation.
- **IoMT Profiles descriptions**: IoMT Profile, IoMT Component Categories Profile, IoMT Assets Profile, IoMT TVRA Profile.
- **Import/Export features**: how to export the models in XMI and JSON.
- **User documentation**: description of all tool features.
- **Developper documentation**: how to extend the tool.


