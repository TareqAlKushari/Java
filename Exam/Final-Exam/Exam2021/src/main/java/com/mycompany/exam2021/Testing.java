package com.mycompany.exam2021;

class A {
    A(){
        System.out.println("Inside A() constructor.");
    }
    A(int a){
        System.out.println("Inside A(int) constructor.");
    }
}

class B extends A{
    B(){
        System.out.println("Inside B() constructor.");
    }
    B(int b){
        System.out.println("Inside B(int) constructor.");
    }
}

class C extends B{
    {
        System.out.println("Inside C constructor.");
    }
    C(){
        super(2);
        System.out.println("Inside C() constructor.");
    }
    C(int a){
        this();
        System.out.println("Inside C(int) constructor.");
    }
}




public class Testing
{
public static void main(String[] args) {
   int arr[] = new int [5];
   System.out.print(arr);
    
}
}