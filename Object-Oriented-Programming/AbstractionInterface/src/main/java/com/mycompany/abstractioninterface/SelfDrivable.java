package com.mycompany.abstractioninterface;

public interface SelfDrivable {
    void destination(String d);
    void drive();
    default void newMethod() {
        System.out.println("newMethod");
    }
}
