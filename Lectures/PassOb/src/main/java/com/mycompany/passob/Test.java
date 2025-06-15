/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passob;

/**
 *
 * @author msi3
 */
public class Test {
    int a, b;
    
    Test(int i, int j){
        a = i;
        b = j;
    }
    
    boolean equalTo(Test o){
        if(o.a == a && o.b ==b)
            return true;
        else
            return false;
    }
}
