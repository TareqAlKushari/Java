package com.mycompany.abstraction;

public abstract class SUVAli extends Car{
    @Override
    void autopilot() {
        System.out.println("SUVAli");
    }
    
    abstract void streamingServices();
    
    abstract void parkingSensors();
}
