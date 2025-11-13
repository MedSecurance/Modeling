#! /bin/bash

MACHDEP="avr_8.yml"

TARGET_OPTS=" \
  --target=avr \
  -mmcu=atmega2560 \
  -DF_CPU=16000000L \
  -Duint_farptr_t=unsigned \
"

TARGET_PHYSICAL_ADDRESSES=" \
  0xC0-0xC6, \
  0x44-0x45, \
  0x5F-0x5F, \
  0x6E-0x6E, \
  0x80-0x81, \
  0x90-0x91, \
  0xA0-0xA1, \
  0xB0-0xB1, \
  0x120-0x121, \
  0x7A-0x7A, \
  0x20-0x33, \
  0x100-0x10B, \
"

ARDUINO_C_INCLUDE_PATHS=" \
  -I./avr-libc/include \
  -I./ArduinoCore-avr/variants/mega/ \
  -I./ArduinoCore-avr/cores/arduino \
"

ARDUINO_C_SOURCES=" \
  ./ArduinoCore-avr/cores/arduino/wiring.c \
  ./ArduinoCore-avr/cores/arduino/wiring_digital.c \
"

ARDUINO_CPP_INCLUDE_PATHS=" \
  -I$(frama-c -print-share-path)/libc \
  $ARDUINO_C_INCLUDE_PATHS \
"

ARDUINO_CPP_SOURCES=" \
  ./ArduinoCore-avr/cores/arduino/Tone.cpp \
  ./ArduinoCore-avr/cores/arduino/Stream.cpp \
  ./ArduinoCore-avr/cores/arduino/HardwareSerial.cpp \
  ./ArduinoCore-avr/cores/arduino/HardwareSerial0.cpp \
  ./ArduinoCore-avr/cores/arduino/HardwareSerial1.cpp \
  ./ArduinoCore-avr/cores/arduino/HardwareSerial2.cpp \
  ./ArduinoCore-avr/cores/arduino/HardwareSerial3.cpp \
  ./ArduinoCore-avr/cores/arduino/USBCore.cpp \
  ./ArduinoCore-avr/cores/arduino/abi.cpp \
  ./ArduinoCore-avr/cores/arduino/WString.cpp \
  ./ArduinoCore-avr/cores/arduino/Print.cpp \
  ./ArduinoCore-avr/cores/arduino/WMath.cpp \
  ./ArduinoCore-avr/cores/arduino/main.cpp \
  ./ArduinoCore-avr/cores/arduino/PluggableUSB.cpp \
  ./ArduinoCore-avr/cores/arduino/new.cpp \
  ./ArduinoCore-avr/cores/arduino/IPAddress.cpp \
"

# Too much inline assembly to stub
# ./ArduinoCore-avr/cores/arduino/CDC.cpp \

# For now, exclude libraries
# ./ArduinoCore-avr/libraries/Wire/src/Wire.cpp \
# ./ArduinoCore-avr/libraries/HID/src/HID.cpp \
# ./ArduinoCore-avr/libraries/SoftwareSerial/src/SoftwareSerial.cpp \
# ./ArduinoCore-avr/libraries/SPI/src/SPI.cpp \

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
