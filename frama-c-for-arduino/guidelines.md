# How to support a new platform?

## Creating the machine dependency file

```bash
frama-c-script make-machdep \
    --compiler clang \
    --cpp-arch-flags="--target=avr -mmcu=atmega2560 -I./avr-libc/include" \
    -o <out-file>.yml
```

The `cpp-arch-flags` must correspond to the target architecture. In some cases,
it might be necessary to indicate the precise `libc` that is used by the project
if it is not the one that is chosen by default when running `clang`. Note that
using another compiler than `clang` for generating the machdep can lead to
unexpected failures when running this experimental Frama-C version since it
heavily relies on Clang in backend.

Often, embedded systems libc do not provide some macros that are requires by the
ISO C. Namely:
- `L_tmpnam`
- `FILENAME_MAX`
- `FOPEN_MAX`

Thus, this value will be empty in the generated files, will they are required by
Frama-C. These default values can be used:
```yaml
filename_max: '4096'
fopen_max: '16'
l_tmpnam: '20'
```

## Additional target options

Options that have been provided to the machdep generation are generally necessary
for the preprocessing. Thus, if we follow our previous example, we have to
provide: `--target=avr -mmcu=atmega2560`.

It is also common to have specific macros defined for the target system which
are provided during compilation and not directly in the platform files. For
example, for ATMEGA 2560: `DF_CPU=16000000L` appears in the command lines
executed by the Arduino compiler.

Finally, the platform may have built-in types in their tool chain, it is also
the right place to add them. For example: `-Duint_farptr_t=unsigned`.

Thus, for example, it can be:
```bash
TARGET_OPTS=" \
  --target=avr \
  -mmcu=atmega2560 \
  -DF_CPU=16000000L \
  -Duint_farptr_t=unsigned \
"
```

## Target physical addresses

Both the user code and the platform can use physical memory pins. Of course,
Frama-C does not about them. Thus, it will generate warnings when accessing these
addresses. Frama-C provides an option so that analyzers are aware of the fact
that these addresses are in fact valid and should not generate warnings. In
MedSecurance, we have improved this option so that we can finely tune the allowed
ranges. Thus, one can provide a list of physical ranges:
```bash
TARGET_PHYSICAL_ADDRESSES=" \
  0xC0-0xC6, \
  0x44-0x45, \
  0x5F-0x5F, \
  0x6E-0x6E, \
  0x80-0x81, \
  ...
"
```

## Adding the Arduino sources

It is important to add both the C and C++ sources from Arduino, but not
necessarily all of them. Basically, only the sources that are transitively
needed from the target project should be added. It will avoid having to stub
too many features to circumvent parsing or typing problems.

## Stubbing features

In Arduino cores, it is common that some low-level operations are written as
macros that finally call inline assembly. Frama-C does not handle inline
assembly, thus it basically kills the precision of the analysis, while in fact
it is pretty common that those operations can be simplified to C stubs that
correctly model the operation. For this, once the unsupported feature is
identified, the `__FRAMAC_` can be used to select a stub instead of the feature.

For example, in `avr-libc/include/avr/pgmspace.h`:
```c
#ifdef __FRAMAC__ /* We do not support statement expressions */
static inline uint16_t __fc_pgm_read_word (void *addr){
  return *(uint16_t*)addr;
}
#define pgm_read_word(__addr) __fc_pgm_read_word((void*)(__addr))
#else

/** \ingroup avr_pgmspace
    \def pgm_read_word(__addr)
    Read a word from the program space with a 16-bit (near) byte-address. */
#define pgm_read_word(__addr)    pgm_read_word_near(__addr)
#endif
```

## Workaround Frama-Clang limitations

The C++ backend has known limitations which currently require workarounds in the
code. These examples are from files in `ArduinoCore-avr`.

### Extern storage is not always handled

Currently, Frama-Clang does not always propagate `extern` storage. Thus, variable
declarations becomes 0-initializations that might conflict from a file to another
with *actual* definitions. For this, the solution is to:
- (conditionally) remove `extern` storage,
- provide an initializer and call it when starting main.

For example:

- `cores/arduino/Arduino.h`:
```cpp
#ifdef __FRAMAC__
/* Storages are currently not correctly supported by Frama-Clang.
   Here: it becomes a definition instead of a declaration, with incoherent init.
   We initialize these arrays via an init function,

   See pins_arduino.h
   See main.cpp
*/

/* extern const */ uint16_t /* PROGMEM */ port_to_mode_PGM[13];
...
#else
extern const uint16_t PROGMEM port_to_mode_PGM[];
```

- `variant/mega/pins_arduino.h`:
```c
#ifdef __FRAMAC__ /* see Arduino.h */
#ifdef __cpluscplus
extern "C"
#endif
static inline void init_port_to_mode_PGM(){
  const uint16_t l_port_to_mode_PGM[] = {
#else
const uint16_t PROGMEM port_to_mode_PGM[] = {
#endif
	NOT_A_PORT,
	(uint16_t) &DDRA,
	(uint16_t) &DDRB,
	(uint16_t) &DDRC,
	(uint16_t) &DDRD,
	(uint16_t) &DDRE,
	(uint16_t) &DDRF,
	(uint16_t) &DDRG,
	(uint16_t) &DDRH,
	NOT_A_PORT,
	(uint16_t) &DDRJ,
	(uint16_t) &DDRK,
	(uint16_t) &DDRL,
};
#ifdef __FRAMAC__
  memcpy(port_to_mode_PGM, l_port_to_mode_PGM, sizeof(l_port_to_mode_PGM));
}
#endif
```

- `cores/arduino/main.cpp`:
```cpp
#ifdef __FRAMAC__
/* See Arduino.h */
extern "C" {
  extern void init_port_to_mode_PGM();
}

void init_pins(){
  init_port_to_mode_PGM();
}

void init_hardware_variables(){
  init_pins();
}
#endif

int main(void)
{
#ifdef __FRAMAC__
  init_hardware_variables();
#endif
...
```

### Multiple static definitions might be missed

On a closely related topic, when defining global arrays without size at some
point and with the actual size somewhere, Frama-Clang sometimes fails to
synchronize definitions. For this, the solution is to give the actual size
on declaration.

For example, in `libraries/wire/src/Wire.h`:
```cpp
class TwoWire : public Stream
{
   private:
#ifdef __FRAMAC__ /* Frama-Clang seems to miss actual definition */
    static uint8_t rxBuffer[BUFFER_LENGTH];
#else
     static uint8_t rxBuffer[];
#endif
...
```

### Global initialization is not handled

Finally, constructors on global initializers are not called. Thus, one has to
call them manually (note: this applies to constructors only, not values).

For example:

- `cores/arduino/HardwareSerial.h`:
```cpp
class HardwareSerial : public Stream
{
/* Global initialized with constructor calls are not correctly handled
   by Frama-C analyzers. We stub the HardwareSerial initialization so
   so that we can manually initalize them.

   See main.cpp
   See HardwareSerial0.cpp
   ...
*/
#ifdef __FRAMAC__
  public:
#else
  protected:
#endif

#ifdef __FRAMAC__
    volatile uint8_t * /* const */ _ubrrh;
    ...
#else
    volatile uint8_t * const _ubrrh;
    ...
#endif
...
#ifdef __FRAMAC__ /* See above */
    void __fc_init(volatile uint8_t *ubrrh, ...){
      // We stil use the constructor, for initializing inherited members
      HardwareSerial initializer(ubrrh, ...);
      /* initialize other fields ... */
      *this = initializer ;
    }
#endif
```

- `cores/arduino/HardwareSerial0.cpp`:
```cpp
#ifdef __FRAMAC__
// See HardwareSerial.h
void prepare_HardwareSerial0(){
  Serial.__fc_init(&UBRR0H, &UBRR0L, &UCSR0A, &UCSR0B, &UCSR0C, &UDR0);
}
#endif
```

- `cores/arduino/main.cpp`:
```cpp
#ifdef __FRAMAC__
/* See HardwareSerial.h */
void init_HardwareSerial(){
  extern void prepare_HardwareSerial0();
  prepare_HardwareSerial0();
}

void init_hardware_variables(){
  init_HardwareSerial();
}

int main(void)
{
#ifdef __FRAMAC__
  init_hardware_variables();
#endif
...
```
