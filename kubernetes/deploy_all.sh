#!/bin/bash

export NAMESPACE=papyrusweb
export OPERATION=apply

echo "Install PostgreSQL configuration and container"
kubectl ${OPERATION} -f config_postgres-hl.yaml -n ${NAMESPACE}

echo "Install secret for containers registry"
kubectl ${OPERATION} -f secret_registry_harbor.yaml -n ${NAMESPACE}

echo "Install PapyrusWeb RCP configuration and container"
kubectl ${OPERATION} -f config_rcp_papyrusweb.yaml -n ${NAMESPACE}
kubectl ${OPERATION} -f deployment_rcp_papyrusweb.yaml -n ${NAMESPACE}
kubectl ${OPERATION} -f service_rcp_clusterip.yaml -n ${NAMESPACE}
kubectl ${OPERATION} -f ingress_codegen.yaml -n ${NAMESPACE}

echo "Install PapyrusWebApp configuration and container"

kubectl ${OPERATION} -f config_appweb_papyrusweb.yaml -n ${NAMESPACE}
kubectl ${OPERATION} -f deployment_webapp_papyrusweb.yaml -n ${NAMESPACE}
kubectl ${OPERATION} -f service_webapp_clusterip.yaml -n ${NAMESPACE}
