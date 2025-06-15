package com.mycompany.exam1;


public class B extends A{
    private int a = 1;
    private int b = 3;
    
    public B(){
        a -= 2;
        b += 4;
        System.out.println("a = "+a+"\t b = "+b);
    }
    
    public B(int a, int b){
        super(a,b);
        this.a += b;
        this.b -= a;
        x = a+b;
        
        System.out.println("a = "+this.a+"\t b = "+this.b+"\t x = "+x);
    }
    
}
