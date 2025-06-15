package com.mycompany.abstractioninterface;

public class Car <T> implements GenericInterface <T> {

    @Override
    public T carModel() {
        return (T) new CarV1();
    }
    
}
