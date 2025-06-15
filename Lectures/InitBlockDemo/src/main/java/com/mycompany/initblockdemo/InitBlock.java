package com.mycompany.initblockdemo;

public class InitBlock {
    private int a;
    private static int b = 2;
    
    static {
        System.out.println("Inside the static initialization block: ");
        b = 5;
    }
    
    {
        System.out.println("Inside the non-static initialization block: ");
        a = 2;
    }
    InitBlock(){
        System.out.println("Inside the InitBlock() constructor: ");
    }
    InitBlock(int v){
        System.out.println("Inside the InitBlock(int) constructor: ");
        a = v;
    }
    InitBlock(InitBlock v){
        System.out.println("Inside the InitBlock(InitBlock) constructor: ");
        a = v.a;
    }
    public void displayValues(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
