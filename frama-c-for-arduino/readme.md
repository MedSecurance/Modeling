# Frama-C Arduino prototype

**Dislaimer:** this is an early prototype.

This directory contains:
- an installable Frama-C Arduino distribution with a Dockerfile
- an AVR libc with minimal stubbing for ATMEGA 2560
- an Arduino-Core for AVR with minimal stubbing for ATMEGA 2560
- an example file using ATMEGA 2560.

The analysis with an installed Frama-C for Arduino can be run with:
```bash
./run.sh example.c
```

Which will generate a file `analyzed.sav` that can then be loaded again by
Frama-C to explore the results. Of course, the command that is run by the
script could also be customized directly for other purposes.

## Understanding the command line that is run

Analyzing an Arduino code with Frama-C and Eva plug-in, one needs to provide not
only the source code to analyze and Arduino headers but also the Arduino sources
of the platform. Else, Frama-C cannot provide a suitable semantics to the code
since most functions would be unknown. Thus, the command line must indicate all
these files.

Here is the command run by `run.sh`:
```bash
frama-c \
      -cpp-command="clang -E -C" \
      -cpp-extra-args=" \
              $TARGET_OPTS \
              $ARDUINO_C_INCLUDE_PATHS \
              -D__FRAMAC__ \
      " \
      $ARDUINO_C_SOURCES \
      -fclang-cpp-extra-args=" \
              $TARGET_OPTS \
              $ARDUINO_CPP_INCLUDE_PATHS \
              -D__FRAMAC__ \
      " \
      $ARDUINO_CPP_SOURCES \
      -absolute-valid-range="$TARGET_PHYSICAL_ADDRESSES" \
      -machdep "$MACHDEP" \
      "$@" \
      -eva -eva-precision 3 \
      -save analyzed.sav
```

The C preprocessing command (`-cpp-command`) is overridden to use Clang.
Basically, since Frama-C uses Clang for preprocessing C++, we make sure that we
use the same compiler for C so that the behavior is coherent. Additional
preprocessing arguments (`-cpp-extra-args`) are provided to this command.

Namely:

- `$TARGET_OPTS` are additional options related to target platform (Clang
  `--target` option, target MMCU, configuration macros, ...),
- `$ARDUINO_C_INCLUDE_PATHS` are the `-I` parameters related to Arduino includes,
- `-D__FRAMAC__` enables a macro that allows to customize the Arduino sources for
  Frama-C, for example to replace inline assembly with C stubs.

`$ARDUINO_C_SOURCES` is the list of C files from the Arduino core target.

Then comes the C++ part, we provide additional extra arguments for the C++
preprocessing command (`-fclang-cpp-extra-args`) and C++ sources, the means of
the variables is the same as the ones for C.

The option `-absolute-valid-range` is closely tight to the target hardware
platform. It lists the physical memory addresses that can be accessed safely by
the program. The option `-machdep` provides the description of the machine
architecture, and compiler.

Then come the script arguments (the actual file that correspond to our Arduino
project).

Finally, we ask Frama-C to run the Eva analyzer with a level of precision set at
3. This precision goes from 0 to 11 and depending on the value it sets a lot of
different parameters about the analysis, please refer to the Eva manual for more
details. We save the result in `analyzed.sav`. This file can be loaded using:

```bash
frama-c -load analyzed.sav
# or for GUI
ivette -load analyzed.sav
```

For understanding how to customize all these variables, refer
to [guidelines](guidelines.md).
