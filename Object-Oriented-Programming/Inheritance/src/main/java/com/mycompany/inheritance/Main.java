/*
    .Inheritance:-
        - What do subclasses inherit java?
             => A subclass inherits all the members "(fields, methods, and nested classes)" from its superclass.
                Constructors are not members, so they are not inherited by subclasses, 
                but the "constructor of the superclass can be invoked from the subclass".
    .Types of Inheritance:- => Java is not supported multiple inheritance.
        - Single Inheritance:
        - Multilevel Inheritance:
        - Hierarchical Inheritance:
        - Hybrid Inheritance:
    .Access Modifiers and inheritance:-
        - Private:
        - public:
        - Protected:
 */
package com.mycompany.inheritance;

public class Main {
    
    public static void main(String args[]) {
        Developer d1 = new Developer("Tareq", "tareq.al.kushari@gmail.com", "+967773350540", "IT", "Yemen", 1999, "ERP");
        d1.setName("Ali");
        
        System.out.println(d1.getName());
    }
}
