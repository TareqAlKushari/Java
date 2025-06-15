package com.mycompany.lap7;


 class SB{
    private static int x=2; 
    private int y=5; 
    static{ 
        x+=2; 
        System.out.println("in static Block"); 
        System.out.println("x = "+x); 
        System.out.println("___________________________________________");   
    } 
    
    { 
        x++; 
        y-=2; 
        System.out.println("in nonStatic Block"); 
        System.out.println(" x = "+x+"\t y = "+y); 
        System.out.println("___________________________________________");     
    } 
    
    public SB(){ 
    x+=5; 
    y+=2; 
        System.out.println("int SB() Block"); 
    System.out.println(" x = "+x+"\t y = "+y); 
    System.out.println("___________________________________________"); } 
    
 public SB(int x,int y){ 
        this.y=getY()+x; 
        SB.x=getX()-y; 
        System.out.println("in SB(x,y) Block"); 
        System.out.println(" x = "+SB.x+"\t y = "+this.y); 
    System.out.println("___________________________________________"); 
    } 
    public int getY(){ 
        y+=getX(); 
        return y; 
    } 
     public static int getX(){ 
        return x; 
    } 
}

public class Lap7{
//    public static void main(String[] args) {
//        SB a = new SB(); 
//        SB b = new SB(2,3); 
//    }
    
}   