package com.mycompany.lap4;

import java.util.Arrays;
import java.util.Scanner;

public class Lap4 {

    public static void main(String[] args) {
        /*double c[] = {1.5, -2.3, 4.9, 5.5};
        double d[] = new double[c.length];
        for(int i = 0, j = c.length-1; i < c.length; i++,j--){
            d[i]=c[j];
        }
        for(double i:d){
            System.out.print(i);
        }
        
        System.out.println("");
        Arrays.sort(d);
        
        for(double i:d){
            System.out.println(i);
        }
        
        System.out.println(Arrays.binarySearch(d, 1.5));*/
        Scanner in = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <A[i].length; j++){
                A[i][j] = in.nextInt();
                B[i][j] = in.nextInt();
                C[i][j] = (A[i][j] + B[i][j]);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}
