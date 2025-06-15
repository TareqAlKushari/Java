/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lap2;

import java.util.Scanner;

/**
 *
 * @author msi3
 */
   
public class Lap2 {

    static void Sum(int x){
        
        int sum=0;
        for(int i=1; i <= x; i++){
            sum += i;
            if(i==x){
                System.out.print(i+ "=");
            }
            else
                System.out.print(i+"+");
        }
        System.out.println(sum);
}
    public static void main(String[] args) {
        int x=0;
        Scanner s = new Scanner(System.in);
        
        /*do{
        x = s.nextInt();
        Sum(x);
    }while(x!=0);*/
        int collw=0;
        int rew=0;
        
        rew = s.nextInt();
        collw = s.nextInt();
        
        for(int i=1; i<=rew; i++){
            for(int j=1; j<=collw; j++){
                if(i==1 || j==1 || i==rew || j==collw){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
