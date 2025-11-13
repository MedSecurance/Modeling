FROM debian:trixie

RUN apt-get update && apt-get install -y \
  bash \
  build-essential \
  bzip2 \
  clang \
  ca-certificates \
  cmake \
  curl \
  diffutils \
  gcc \
  git \
  libclang-dev \
  libgmp-dev \
  libpcre2-dev \
  llvm-dev \
  m4 \
  make \
  opam \
  patch \
  pkg-config \
  rsync \
  tar \
  unzip \
  wget \
  which \
  xdot \
  zlib1g-dev \
  python3 \
  python3-pip \
  python3-venv

# Install OCaml environment
ENV OCAML="5.3.0"
RUN opam init -c "$OCAML" --disable-sandboxing

# Install Frama-C dependencies
RUN opam install --confirm-level=unsafe-yes \
  dune \
  dune-configurator \
  dune-site \
  alt-ergo \
  camlp5 \
  camlp-streams \
  menhir \
  ocamlgraph \
  unionFind \
  why3 \
  yaml \
  yojson \
  zarith \
  ppx_deriving \
  ppx_deriving_yojson \
  ppx_deriving_yaml

ENV HOME="/root"
# Setup OCaml environment
ENV OPAM_SWITCH_PREFIX="$HOME/.opam/$OCAML"
ENV CAML_LD_LIBRARY_PATH="$OPAM_SWITCH_PREFIX/lib/stublibs:$OPAM_SWITCH_PREFIX/lib/ocaml/stublibs:$OPAM_SWITCH_PREFIX/lib/ocaml"
ENV OCAML_TOPLEVEL_PATH="$OPAM_SWITCH_PREFIX/lib/toplevel"
ENV PATH="$OPAM_SWITCH_PREFIX/bin:$PATH"

# Copy and install Frama-C
ENV FRAMAC="frama-c-30.0+MedSecurance-Arduino"
COPY "$FRAMAC".tar.gz .
RUN tar xzf "$FRAMAC".tar.gz &&  make PREFIX=$OPAM_SWITCH_PREFIX RELEASE=yes -C "$FRAMAC" install

# Setup Why3 runtime dependency
RUN why3 config detect

# Extract example here
COPY example.tar.gz .
RUN tar xzf example.tar.gz --strip-components=1

# Install Python dependencies for REST API
COPY api/requirements.txt /opt/framac-api/requirements.txt
RUN pip3 install --break-system-packages -r /opt/framac-api/requirements.txt

# Copy API server
COPY api/api_server.py /opt/framac-api/api_server.py
RUN chmod +x /opt/framac-api/api_server.py

# Expose API port
EXPOSE 5000

# Set working directory
WORKDIR /root

# Default command runs the API server
CMD ["python3", "/opt/framac-api/api_server.py"]
