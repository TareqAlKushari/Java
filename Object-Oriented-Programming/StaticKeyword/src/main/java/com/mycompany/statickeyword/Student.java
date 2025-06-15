/*
    Static Keyword:-
        .Static Variable:

        .Static Method: -> Restrictions for the static method.
            1. The static method cannot use non static data member or call non-static method directly.
            2. "this" and "super" cannot be used in static context.

        .Static Block:

        .Static Class: -> A class can be made static only if it is a nested class.
 */
package com.mycompany.statickeyword;

public class Student {
    private int no;
    private String name;
    private String password;
    private boolean loggedIn;
    private static int count = 1;
    private static String college = "IT";
    private static int minimalPasswordLength = 6;
    
    public Student(String name, String password) {
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }
    
    public boolean logIn(int enteredNo, String enteredPassword) {
        if(enteredNo == this.no && enteredPassword.equals(this.password)) {
            loggedIn = true;
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean validatePassword(String password) {
        if(password.length() >= minimalPasswordLength) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" + "no=" + no + ", name=" + name + '}';
    }
    
    
}
