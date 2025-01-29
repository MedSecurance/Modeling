# Configuration files for Papyrus Web RCP and WebApp deployment

This folder contains .yaml files to deploy the Papyrus Web App, Papyrus RCP Service and FHIR generator applications in a kubernetes cluster.

The specific host and secret values need to be configured by instance, and should not be publicy available for security reasons.

It assumes the images deployed in some registry.

The deploy_all.sh script deploys all containers into the cluster. 
