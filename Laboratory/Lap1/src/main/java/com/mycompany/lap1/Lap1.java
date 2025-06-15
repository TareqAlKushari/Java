package com.mycompany.lap1;

import java.util.Scanner;

public class Lap1 {

    public static void main(String[] args) {
        //int x =5;
        //float y = 5.2f;
        
        int x,y,d,t;
        
        //int x,y,b,s,e;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        b = scan.nextInt();
        t = x;
        if(y>t){
            t = y;
        }
        else if(d>t){
            t = d;
        }
        System.out.println("the grete is: "+t);
        
        
//        System.out.println("My first project: ");
//        System.out.print("My first project:\n ");
//        System.out.printf("X = %d \ty = %f", x,y);
//        System.out.println(" X="+x+"\ty"+y);
    }
}
