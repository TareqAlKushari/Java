/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.initblockdemo;

/**
 *
 * @author msi3
 */
public class InitBlockDemo {

    public static void main(String[] args) {
        System.out.println("Starting the main() method");
        InitBlock ib1;
        InitBlock ib2;
        InitBlock ib3;
        System.out.println("After declaring the reference");
        ib1 = new InitBlock();
        ib2 = new InitBlock(17);
        ib3 = new InitBlock(ib2);
        System.out.println("After creating the objects");
        ib1.displayValues();
        ib2.displayValues();
        ib3.displayValues();
    }
}
