#include <stdio.h>
#include <stdbool.h>

// Simple LED state simulator
bool ledState = false;
int sensorValue = 0;

// Simulate pinMode
void pinMode(int pin, int mode) {
    printf("Pin %d configured as %s\n", pin, mode == 1 ? "OUTPUT" : "INPUT");
}

// Simulate digitalWrite
void digitalWrite(int pin, int value) {
    ledState = (value == 1);
    printf("Pin %d set to %s\n", pin, ledState ? "HIGH" : "LOW");
}

// Simulate analogRead - returns value between 0-1023
int analogRead(int pin) {
    // Simulate sensor reading
    sensorValue = (sensorValue + 10) % 1024;
    return sensorValue;
}

// Map function
int map(int x, int in_min, int in_max, int out_min, int out_max) {
    return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
}

// Main program logic
void processCommand(char command) {
    if (command == '1') {
digitalWrite(13, 1);
printf("LED turned ON\n");
    } else if (command == '0') {
digitalWrite(13, 0);
printf("LED turned OFF\n");
    }
}

void readSensor() {
    int sensor = analogRead(0);
    int output = map(sensor, 0, 1023, 0, 255);
    printf("Sensor: %d, Mapped output: %d\n", sensor, output);
}

int main() {
    // Setup
    printf("=== Arduino Simulator Starting ===\n");
    pinMode(13, 1); // OUTPUT mode
    
    // Simulate loop iterations
    printf("\n=== Running 5 iterations ===\n");
    for (int i = 0; i < 5; i++) {
printf("\n--- Iteration %d ---\n", i + 1);

// Test LED commands
if (i % 2 == 0) {
    processCommand('1');
} else {
    processCommand('0');
}

// Read sensor
readSensor();
    }
    
    printf("\n=== Program Complete ===\n");
    return 0;
}
