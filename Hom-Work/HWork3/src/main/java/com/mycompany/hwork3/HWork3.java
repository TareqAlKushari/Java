package com.mycompany.hwork3;

import java.util.Scanner;

public class HWork3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int a = 0;
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <A[i].length; j++){
                A[i][j] = in.nextInt();
            }
        }
        for(int i = A.length-1; i >= 0; i--){
            for(int j = 0; j < A[i].length; j++){
                B[a][j] = A[i][j];
            }
            ++a;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Hello World!");
    }
}
