package com.mycompany.abstractioninterface;

public class CarV1 implements MarkerInterface, Movable, SelfDrivable {
    private int X,Y;
    private int numberOfPassengers;
    
    public CarV1() {};

    public CarV1(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public void moveUp() {
        Y--;
    }

    @Override
    public void moveDow() {
        Y++;
    }

    @Override
    public void moveLeft() {
        X--;
    }

    @Override
    public void moveRight() {
        X++;
    }

    @Override
    public void destination(String d) {
        System.out.println("Destination = " + d);
    }

    @Override
    public void drive() {
        System.out.println("Drive V1");
    }
    
    
}
