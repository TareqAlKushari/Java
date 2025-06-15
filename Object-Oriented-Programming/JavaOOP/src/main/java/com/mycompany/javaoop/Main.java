/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author msi3
 */
public class Main {
    public static void main(String args[]){
        Account a1 = new Account(), a2 = new Account(), a3 = new Account();
        
        a1.insert(4451238, "Mohammed", 10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        a1.toString();
        
        a2.insert(9563145, "Tareq", 100);
        a2.deposit(50);
        a2.withdraw(140);
        a2.checkBalance();
        a2.toString();
        
        a3.insert(4451238, "Ahmad", 500);
        a3.deposit(550);
        a3.withdraw(10);
        a3.checkBalance();
        a3.toString();
    }
}
