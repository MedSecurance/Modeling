
#  Copyright (c) 2024 CEA LIST.
#  All rights reserved. This program and the accompanying materials
#  are the property of CEA LIST, their use is subject to specific
#  agreement with the CEA LIST.
#  Marcos Didonet Del Fabro (CEA LIST ) - first implementation

# to build
# docker build -t codegen_rcp -f dockerfiles/rcp/Dockerfile .
# to launch
# docker run -it --name=codegen_rcp_container p 8083:8083 codegen_rcp:latest

# Dockerfile to create the image of the RCP Web server.


# Image for compilation
FROM csanchez/maven:openjdk-17 AS codegen-rcp-build

COPY bundles /build/bundles
COPY rcp /build/rcp
COPY releng /build/releng
COPY pom.xml runRCP.sh /build
WORKDIR /build
RUN mvn clean verify -DskipTests


# Image to run the RCP

FROM eclipse-temurin:17-jre AS codegen_rcp

RUN apt-get -y update && \
    apt-get install --no-install-recommends  \
    -y unzip

ENV SERVERPRODUCT_LINUX_ZIP_FILENAME=org.eclipse.papyrus.web.rcp.product-linux.gtk.x86_64.zip

COPY --from=codegen-rcp-build /build/rcp/org.eclipse.papyrus.web.rcp.product/target/products/${SERVERPRODUCT_LINUX_ZIP_FILENAME} ${SERVERPRODUCT_LINUX_ZIP_FILENAME}
RUN unzip ${SERVERPRODUCT_LINUX_ZIP_FILENAME}

ENV RCP_SERVER_PORT=8083
ENV APPWEB_URL=localhost

EXPOSE 8083

WORKDIR /papyruswebsvc
ENTRYPOINT ./eclipse -application org.eclipse.ui.ide.workbench
