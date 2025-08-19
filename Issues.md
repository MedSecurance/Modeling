# MedSecurance Code Generation Module — Setup & Troubleshooting Log

This README documents the steps and modifications applied to get the MedSecurance `papyrus-web`,
`modeling-services-rcp`, `medsecuranceappgen` services running via Docker. The project uses Eclipse 
Papyrus components and builds with Maven.

---
## Prerequisites

* Docker and Docker Compose installed
* GitHub Personal Access Token with repo access
* Java 17
* Maven (installed inside Docker image)
* Access to the MedSecurance repository structure:

  ```
  Modeling/
  ├── papyrus-web/
  ├── medsecuranceappgen/
  └── modeling-services-rcp/
  ```

---

## 🛠️ Step-by-Step Setup

### 1. Set GitHub Credentials (Local Dev)

Set these environment variables in your terminal:

```bash
export GITHUB_USERNAME=StamatisOrfanos
export GITHUB_AUTH_TOKEN=ghp_xxxxxxxxxxxxxxxxxxxx
```

This is required for Docker to clone or access any GitHub-hosted dependencies during image builds.

Add the same information in the .env file of the papyrus-web project.

```dockerfile
GITHUB_USERNAME=StamatisOrfanos
GITHUB_AUTH_TOKEN=ghp_xxxxxxxxxxxxxxxxxxxx
```

---

### 2. Fix Missing Context Error in Docker Compose

The original Docker build failed with:

```
unable to prepare context: path "/Users/.../services/modeling-services-rcp" not found
```

**Fix**: Ensure that `modeling-services-rcp/` exists at the correct path and is included in the 
Docker build context. Specifically we removed the `/services` since the folder did not exist.

---

### 3. ${MAVEN_VERSION} variable is not defined at build time

In the medsecuranceappgen project in the Dockerfile we had to add the following:
```
build:
context: ../medsecuranceappgen
dockerfile: dockerfiles/Dockerfile
args:
MAVEN_VERSION: 3.9.4
```

We also had to replace the line:
```
wget https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz &&\
```
,with:
```
wget https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz &&\
```


### 4. Maven Resolution Failure — Papyrus Designer `.target` Issues

Error observed:
```
Failed to resolve target definition ... Could not find 
"org.eclipse.papyrus.designer.languages.c.feature.feature.group/0.0.0"
```

#### 🔍 Problem Source

The `.target` file at:

```
modeling-services-rcp/releng/targetplatforms/org.eclipse.papyrus.web.targetplatform.target
```

...was referring to missing or outdated repositories:

* `https://download.eclipse.org/modeling/mdt/papyrus/updates/nightly/latest`
* and components that no longer exist or are archived.

---

### 4. Modifications to the `.target` File

#### Attempted Fixes:

* Commented out or removed the following failing units:

  ```xml
    <unit id="org.eclipse.papyrus.designer.languages.c.feature.feature.group" version="0.0.0"/>
    <unit id="org.eclipse.papyrus.designer.languages.common.feature.feature.group" version="0.0.0"/>
    <unit id="org.eclipse.papyrus.designer.languages.cpp.feature.feature.group" version="0.0.0"/>
  ```

* Later re-added them, but replaced the **broken repository** with this working CI snapshot:

  ```xml
    <repository location="https://ci.eclipse.org/papyrus/job/papyrus-designer-2023-12/lastSuccessfulBuild/artifact/releng/org.eclipse.papyrus.designer.p2/target/repository/"/>
  ```

This change ensured that the latest available features could be downloaded from Eclipse Jenkins builds, bypassing outdated public mirrors.

* Tried and failed to use a set of stable versions replacing:
  ```xml
    <unit id="org.eclipse.papyrus.designer.languages.c.feature.feature.group" version="0.0.0"/>
    <unit id="org.eclipse.papyrus.designer.languages.common.feature.feature.group" version="0.0.0"/>
    <unit id="org.eclipse.papyrus.designer.languages.cpp.feature.feature.group" version="0.0.0"/>
  ```

with:
```xml
    <unit id="org.eclipse.papyrus.designer.languages.c.feature.feature.group" version="3.2.0"/>
    <unit id="org.eclipse.papyrus.designer.languages.common.feature.feature.group" version="x.x.x"/>
    <unit id="org.eclipse.papyrus.designer.languages.cpp.feature.feature.group" version="x.x.x"/>
```

* We tried to comment out the dependencies that caused issues, just to find out that the next 
dependencies had the same issues, showing that the main issue is not the individual dependencies
but most probably the source of downloading the repositories.

---

### 5. Current Known Working Configuration

Replace the failing repository in the `.target` file with:

```xml
<repository location="https://ci.eclipse.org/papyrus/job/papyrus-designer-2023-12/lastSuccessfulBuild/artifact/releng/org.eclipse.papyrus.designer.p2/target/repository/"/>
```

This repository supports resolution of all required feature groups including:

* `org.eclipse.papyrus.designer.languages.java.feature.feature.group`
* `org.eclipse.papyrus.designer.languages.python.feature.feature.group`
* and others required for Java/Python code generation.

---

## Remaining Issues

* Resolution still fails if any feature group in the `.target` file is unavailable in the repository.
* The build is dependent on upstream CI snapshots — fragile for long-term reproducibility.

---

## Suggested Improvements

* Prune `.target` to include only Java/Python-related components if C/CPP are not required
* Mirror working repositories locally or cache them in Docker for faster builds
* Document versions and dependencies as they evolve

---

## Build Instructions

Once everything is updated:

```bash
cd papyrus-web/
docker compose build --no-cache
```

---

## Notes

* Always re-run with `--no-cache` after modifying `.target` or Dockerfile.
* This log only reflects the setup **up to July 31, 2025** — future updates may affect reproducibility.

---

Maintainer: [Stamatis Orfanos](https://github.com/StamatisOrfanos)
