package com.mycompany.hwork1;

import java.util.Scanner;

public class HWork1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int contA=0, contB=0, contC=0;
        String greed = new String();
        
        do{
            System.out.println("Inpot Eny Char or \"0\" to Out");
            greed = in.next();
            
            switch(greed){
                case "A":
                case "a":
                    ++contA;
                    break;
                case "B":
                case "b":
                    ++contB;
                    break;
                case "C":
                case "c":
                    ++contC;
                    break;
                default:
                    System.out.println("Inpot Char ");
            }
            
        }while(!"0".equals(greed));
        System.out.println("The Conter A is: " + contA + "\nThe Conter B is: " + contB + "\nThe Conter C is: " + contC);
    }
}


