# Generation of Java code using Papyrus Designer from a Papyrus Web UML model

This plug-in is a service for code generation.


It expects two environment variables:

- APPWEB_HOST: the host to the PapyrusWeb application that returns the input model
- APPWEB_PORT: the port to the PapyrusWeb application

## Requirements

- generate code from the input model calling the Papyrus Software designer plug-in.

## Needed improvements

- improve the way it instantiates and calls the Codegen plug-in.
- check where the output generated files will be saved. This implementation returns a zip file with the generated code.

