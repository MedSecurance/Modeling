/*
  main.cpp - Main loop for Arduino sketches
  Copyright (c) 2005-2013 Arduino Team.  All right reserved.

  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General Public
  License along with this library; if not, write to the Free Software
  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/

#include <Arduino.h>

// Declared weak in Arduino.h to allow user redefinitions.
int atexit(void (* /*func*/ )()) { return 0; }

// Weak empty variant initialization function.
// May be redefined by variant files.
void initVariant() __attribute__((weak));
void initVariant() { }

void setupUSB() __attribute__((weak));
void setupUSB() { }

#ifdef __FRAMAC__
/* See HardwareSerial.h */
void init_HardwareSerial(){
  extern void prepare_HardwareSerial0();
  extern void prepare_HardwareSerial1();
  extern void prepare_HardwareSerial2();
  extern void prepare_HardwareSerial3();
  prepare_HardwareSerial0();
  prepare_HardwareSerial1();
  prepare_HardwareSerial2();
  prepare_HardwareSerial3();
}

/* See Arduino.h */
extern "C" {
  extern void init_port_to_mode_PGM();
  extern void init_port_to_output_PGM();
  extern void init_port_to_input_PGM();
  extern void init_digital_pin_to_port_PGM();
  extern void init_digital_pin_to_bit_mask_PGM();
  extern void init_digital_pin_to_timer_PGM();
}

void init_pins(){
  init_port_to_mode_PGM();
  init_port_to_output_PGM();
  init_port_to_input_PGM();
  init_digital_pin_to_port_PGM();
  init_digital_pin_to_bit_mask_PGM();
  init_digital_pin_to_timer_PGM();
}

void init_hardware_variables(){
  init_HardwareSerial();
  init_pins();
}
#endif

int main(void)
{
#ifdef __FRAMAC__
  init_hardware_variables();
#endif

	init();

	initVariant();

#if defined(USBCON)
	USBDevice.attach();
#endif

	setup();

	for (;;) {
		loop();
		if (serialEventRun) serialEventRun();
	}

	return 0;
}
