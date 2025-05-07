#  Copyright (c) 2024 CEA LIST.
#  All rights reserved. This program and the accompanying materials
#  are the property of CEA LIST, their use is subject to specific
#  agreement with the CEA LIST.
#  Pascal Bannerot (CEA LIST ) - first implementation

# to build
# docker build --build-arg USERNAME=<github user name> --build-arg PASSWORD=<git hub toke> --build-arg WEBAPP_VERSION=2024.10.0 -t papyrusweb -f backend/papyrus-web/Dockerfile.local .
# to launch. Note that it is necessary to have a running postgres image or local database
# docker run --name=papyrusweb-container -p 8080:8080 papyrusweb:latest

# to run without docker compose
# docker run --name=papyrusweb-container --network=host -p 8080:8080 papyrusweb:latest 

# Dockerfile to create the image of the RCP Web server.

# Image for compilation

FROM ubuntu:24.04 as generateiomtapp-build

ADD . /build
WORKDIR /build/

ENV MAVEN_VERSION="3.9.4"

ENV WEBAPP_VERSION="2025.1.7-SNAPSHOT"

RUN apt-get update &&\
  apt-get install openjdk-17-jdk -y &&\
  apt-get install wget -y &&\
  wget https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz &&\
  tar -xzvf apache-maven-${MAVEN_VERSION}-bin.tar.gz &&\
  export PATH=$PWD/apache-maven-$MAVEN_VERSION/bin:$PATH &&\
  mvn install:install-file \
     -Dfile=./lib/papyrus-web-iomt-assertions-profile-model-${WEBAPP_VERSION}.jar \
     -DgroupId=papyrus-web \
     -DartifactId=papyrus-web-iomt-assertions-profile-model \
     -Dversion=${WEBAPP_VERSION} \
     -Dpackaging=jar \
     -DgeneratePom=true &&\
 mvn install:install-file \
      -Dfile=./lib/papyrus-web-iomt-assets-profile-model-${WEBAPP_VERSION}.jar \
      -DgroupId=papyrus-web \
      -DartifactId=papyrus-web-iomt-assets-profile-model \
      -Dversion=${WEBAPP_VERSION} \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/papyrus-web-iomt-componentcategories-profile-model-${WEBAPP_VERSION}.jar \
      -DgroupId=papyrus-web \
      -DartifactId=papyrus-web-iomt-componentcategories-profile-model \
      -Dversion=${WEBAPP_VERSION} \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/papyrus-web-iomt-profile-${WEBAPP_VERSION}.jar \
      -DgroupId=papyrus-web \
      -DartifactId=papyrus-web-iomt-profile \
      -Dversion=${WEBAPP_VERSION} \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/papyrus-web-iomt-tvra-profile-model-${WEBAPP_VERSION}.jar \
      -DgroupId=papyrus-web \
      -DartifactId=papyrus-web-iomt-tvra-profile-model \
      -Dversion=${WEBAPP_VERSION} \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/papyrus-web-iomt-profile-model-${WEBAPP_VERSION}.jar \
      -DgroupId=papyrus-web \
      -DartifactId=papyrus-web-iomt-profile-model \
      -Dversion=${WEBAPP_VERSION} \
      -Dpackaging=jar \
      -DgeneratePom=true &&\      
  mvn install:install-file \
      -Dfile=./lib/org.eclipse.uml2.common-2.5.0-SNAPSHOT.jar \
      -DgroupId=org.eclipse.uml2.plugins \
      -DartifactId=org.eclipse.uml2.common \
      -Dversion=2.5.0-SNAPSHOT \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/org.eclipse.uml2.types-2.5.0-SNAPSHOT.jar \
      -DgroupId=org.eclipse.uml2.plugins \
      -DartifactId=org.eclipse.uml2.types \
      -Dversion=2.5.0-SNAPSHOT \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/org.eclipse.uml2.uml.profile.standard-1.5.0-SNAPSHOT.jar \
      -DgroupId=org.eclipse.uml2.plugins \
      -DartifactId=org.eclipse.uml2.uml.profile.standard \
      -Dversion=1.5.0-SNAPSHOT \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/org.eclipse.uml2.uml.resources-5.5.0-SNAPSHOT.jar \
      -DgroupId=org.eclipse.uml2.plugins \
      -DartifactId=org.eclipse.uml2.uml.resources \
      -Dversion=5.5.0-SNAPSHOT \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn install:install-file \
      -Dfile=./lib/org.eclipse.uml2.uml-5.5.0-SNAPSHOT.jar \
      -DgroupId=org.eclipse.uml2.plugins \
      -DartifactId=org.eclipse.uml2.uml \
      -Dversion=5.5.0-SNAPSHOT \
      -Dpackaging=jar \
      -DgeneratePom=true &&\
  mvn clean verify -DskipTests -Dcheckstyle.skip

# Image to run Papyrus Web

FROM eclipse-temurin:17-jre as generateiomtapp

ENV WEBAPP_VERSION="2025.1.7-SNAPSHOT"

RUN apt-get update && apt-get install -y openjdk-17-jre && apt-get clean cache

COPY --from=generateiomtapp-build /build/target/papyrus-web-generate-medsecurance-gateway-${WEBAPP_VERSION}.jar ./app.jar
EXPOSE 9000


ENTRYPOINT ["java","-jar","/app.jar"]

