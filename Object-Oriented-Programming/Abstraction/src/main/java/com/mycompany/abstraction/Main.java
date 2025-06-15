package com.mycompany.abstraction;

public class Main {
    
    static void fun(Car obj) {
        obj.autopilot();
    }
    public static void main(String[] args) {
        Car car1 = new SUV();
        //car1.autopilot();
        
        fun(new SUV());
        fun(new Hatchback());
        fun(car1);
        
        car1 = new Hatchback();
    }
}
