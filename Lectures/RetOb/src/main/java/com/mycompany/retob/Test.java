/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retob;

/**
 *
 * @author msi3
 */
public class Test {
    int a;
    
    Test(int i){
        a = i;
    }
    
    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
}
