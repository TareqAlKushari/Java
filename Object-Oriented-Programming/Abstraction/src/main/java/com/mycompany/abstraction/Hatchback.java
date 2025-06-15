package com.mycompany.abstraction;

public class Hatchback extends Car {

    @Override
    void autopilot() {
        System.out.println("Hatchback autopilot");
    }

    @Override
    void streamingServices() {
        System.out.println("Hatchback streamingServices");
    }

    @Override
    void parkingSensors() {
        System.out.println("Hatchback parkingSensors");
    }
    
}
