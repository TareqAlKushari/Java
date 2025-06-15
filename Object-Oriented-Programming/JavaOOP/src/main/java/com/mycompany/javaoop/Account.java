/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author msi3
 */
public class Account {
    private int accountNo;
    private String name;
    private float amount;
    
    public void insert(int a, String n, float amt){
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }
    
    public void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println(amt + "depoited");
    }
    
    public void withdraw(float amt){
        if(this.amount < amt){
            System.out.println("Insufficient Balance");
        }
        else {
            this.amount = this.amount - amt;
            System.out.println(amt + "withdrawn");
        }
    }
    
    public void checkBalance() {
        System.out.println("Balance = " + this.amount);
    }

    @Override
    public String toString() {
        return "Account{" + "accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + '}';
    }
    
    
}
