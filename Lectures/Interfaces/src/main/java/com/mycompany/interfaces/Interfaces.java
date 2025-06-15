package com.mycompany.interfaces;

interface A {
    void fanA1();
    void fanA2();
}


interface C {
    void fanC();
}

interface B implements A, C {
    void fanB();
}



class MyClass implements B {
    public void fanA1() {
        System.out.println("Implements fanA1(). ");
    }
    
    public void fanA2() {
        System.out.println("Implements fanA2(). ");
    }
    
    public void fanB() {
        System.out.println("Implements fanB(). ");
    }
    
    public void fanC() {
        System.out.println("Implements fanC(). ");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        MyClass ob = new MyClass();
        
        ob.fanA1();
        ob.fanA2();
        ob.fanB();
        ob.fanC();
    }
}
