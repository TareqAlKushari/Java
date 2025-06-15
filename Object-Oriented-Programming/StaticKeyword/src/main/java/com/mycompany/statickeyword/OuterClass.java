package com.mycompany.statickeyword;

public class OuterClass {
    static int x = 10;
    
    public static class InnerClass {
        public void print() {
            System.out.println("X = "+ x);
        }
    }
}
