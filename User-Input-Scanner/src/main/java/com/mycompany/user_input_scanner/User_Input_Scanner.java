package com.mycompany.user_input_scanner;
import java.util.Scanner;
import java.io. * ;

// User Input (Scanner), Printf methods:
    /*
    nextBoolean()
    nextByte()
    nextShort()
    nextInt()
    nextLong()
    nextFloat()
    nextDouble()
    next()
    nextLine()
    */

public class User_Input_Scanner {
    public static void main(String args[]) throws Exception {
    //Scanner scan = new Scanner(System.in);
    
        /*System.out.print("Enter The Number: ");
        int a = scan.nextInt(); 
        System.out.println(a);*/
        
    /*float num1, num2;
        System.out.println("Please Enter The First Number: ");
        num1 = scan.nextFloat();
        System.out.println("Please Enter The Second Number: ");
        num2 = scan.nextFloat();
        System.out.println("The Num1 = "+num1+" "+"The Num2 = "+num2);
        System.out.printf("The Num1 = %.2f  Num2 = %f%n",num1,num2);*/
        
    /*System.out.println("Please Enter The Value for s: ");
    String s = scan.nextLine();
        System.out.printf("s = %s",s);*/
        
        
    /*System.out.println("Please Enter The Value for c: ");
    char c = scan.next().charAt(0);
        System.out.printf("s = %C",c);*/    
    
    InputStreamReader ir = new InputStreamReader(System. in);
    BufferedReader br = new BufferedReader(ir);
    
    System.out.println("Enter the string name: ");
        String name = br.readLine();
        System.out.println("the name is: " + name); 
    }
/*
d : [byte, short, int, long]
f : [float, double]
cC: character Capital C will uppercase the letter
sS: String Capital S will uppercase the letters in the string
n : newline    
*/     
}
