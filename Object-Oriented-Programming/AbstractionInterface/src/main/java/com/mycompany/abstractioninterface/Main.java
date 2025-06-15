package com.mycompany.abstractioninterface;

public class Main {
    
    static void interfaceMethod(SelfDrivable s) {
        s.drive();
    }
    public static void main(String[] args) {
        /*SelfDrivable c1 = new CarV1();
        c1.drive();
        c1 = new CarV2();
        c1.drive();
        
        interfaceMethod(new CarV1());
        interfaceMethod(new CarV2());*/
        
        /*CarV2 c1 = new CarV2();
        if(c1 instanceof MarkerInterface)
            System.out.println("Yes");
        else
            System.out.println("No");*/
        
        GenericInterface <Car> CarV1Obj = new Car();
        
        Car car = CarV1Obj.carModel();
    }
}
