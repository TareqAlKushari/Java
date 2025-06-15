package com.mycompany.constructor;

public class Main {
    
    public static void main(String args[]) {
        Product p1 = new Product("Camera", "Auto focus...", 99, 10, 5, "Red");
        p1.setPrice(80);
        
        Product p2 = new Product("T-Shirt", "Size : XL", 15);
        
        Product p3 = new Product(p1);
        p3.display();
    }
}

/*
    Finalizers VS Destructor:

        In Java, when we create an object of the class it occupies some space in the 
        memory (heap). If we do not delete these objects, it remains in the memory 
        and occupies unnecessary space that is not upright from the aspect pf
        programming.

        Java provides the "garbage collector" that works the same as the destructor.
        The garbage collector is a program (thread) that runs on the JVM. It
        automatically deletes the unused objects (objects that are no longer used) and
        free-up the memory. The programmer has no need to manage memory, 
        manually. It can be error-prone, vulnerable, and may lead to a memory leak

        Destructor -> It is also known as finalizers
 */