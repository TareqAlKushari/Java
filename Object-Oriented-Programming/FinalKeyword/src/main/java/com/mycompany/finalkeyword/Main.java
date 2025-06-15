/*
    *Final Keyword:-
        - Final Parameters: -> Stop Value Change
        - Final Methods: -> Stop Method Overriding
        - Final Classes: -> Stop Inheritance
        - Final References
 */
package com.mycompany.finalkeyword;

public class Main {
    
    static void fun() {
        final String s1;
        s1="ABC";
    }
    
    public static void main(String[] args) {
//        final int STUDENT_ID;
//        STUDENT_ID = 44;

        final Student s1 = new Student(123, "tareq", 1999);
//        s1 = new Student(567, "tareq", 1999);
        Student s2 = new Student(124, "tareq", 1999);
        Student s3 = new Student(125, "tareq", 1999);
        Student s4 = new Student(126, "tareq", 1999);
            
        
        
        System.out.println("s4 "+s4.STUDENT_ID);
    }
}
