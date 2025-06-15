package com.mycompany.statickeyword;

public class Main {
    static int x; //Static Variable
    
    //Static Block
    static{
        x = 5;
        System.out.println("Static Block");
    }
    static{
        x = 15;
        System.out.println("Static Block");
    }
    
    public static void main(String[] args) {
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.print();
        
        // Main m = new Main();
        //x = 10;
        //System.out.println(x);
        
        Student student1 = new Student("Tareq", "123");
        Student student2 = new Student("Ammar", "253");
        Student student3 = new Student("Ala'a", "568");
        
        
        //System.out.println(student1.logIn(1, "123"));
        
        
        //System.out.println(student2.toString());
        //System.out.println(student3.toString());
    }
}

