package com.mycompany.abstractioninterface;

public interface Movable {
    void moveUp();
    void moveDow();
    void moveLeft();
    void moveRight();
    static void newMethod() {
        System.out.println("Static newMethod");
    }
}
