package com.mycompany.exam1;


class A{
    static int x = 2; 
    private int y = 3; 
    
    static{ 
        x++; 
        System.out.println("Java Final Exam :"); 
    } 
    
    { 
        x+=3; 
        y--; 
        System.out.println("Non Static Block"); 
        System.out.println(" x = "+x+"\t y = "+y); 
        System.out.println("___________________________________________");     
    } 
    
    public A(){ 
        x -= 3;
        y+=x;
    
        System.out.println("int A() Block"); 
        System.out.println(" x = "+x+"\t y = "+y); 
        System.out.println("___________________________________________");
    } 
    
    public A(int y) {
        this(y, y);
        x = y + this.y;
        this.y = y;
        
        System.out.println("x = "+x+"\t y = "+this.y);
    }
    
    public A(int x,int y){ 
        
        A.x -= x;
        this.y -= y;
        System.out.println("in A(x,y) Block"); 
        System.out.println(" x = "+x+"\t y = "+y); 
        System.out.println("___________________________________________"); 
    } 
    
}
