/*
    *Overriding:-
        - Method Overriding: This is an example of runtime-time polymorphism (Dynamic binding or Late binding)

        - Can we override a static method? No Can not
            - Static methods cannot be annotated with @Override

    *Overloading:-
        - Method Overloading: This is an example of compile-time polymorphism (Early binding or Static binding)
        - Static binding or Early binding

    *polymorphic (Generic) Array Typess:-
    
*/

package com.mycompany.polymorphism;


public class Main {
    
    static void p(Employee e1) {
        e1.print();
    }
    
    public static void main(String[] args) {
    //######################//
        //Overriding//
    //######################//
        
//        p(new SalariedEmployee());
    
//        Employee e1 = new Employee();
//        SalariedEmployee e2 = new SalariedEmployee();
//        // We can override a static method
//        e1.print(); //Base-Class 
//        e2.print(); //Sup-Class
        
        
        
//        Employee e1 = new SalariedEmployee();
//        // We can't override a static method
//        e1.print(); // Can not override a static method   Base-Class
        
        
        
//        Employee e1 = new Employee("Tareq", "Yemen", "IT", "@gmail.com", 1000);
//            System.out.println("E1: Salary " + e1.getSalary());
//        e1 = new SalariedEmployee(200, "Tareq", "Yemen", "IT", "@gmail.com", 1000);
//        e1.getSalary();
//        e1.x=20;
//            System.out.println("E2: Salary " + e1.getSalary());
//            
//            
//            
//        e1 = new DailyEmployee(20, 15, "Tareq", "Yemen", "IT", "@gmail.com", 1000);
//            System.out.println("E3: Salary " + e1.getSalary());
//        e1 = new HourlyEmployee(5, 60, "Tareq", "Yemen", "IT", "@gmail.com", 1000);
//            System.out.println("E4: Salary " + e1.getSalary());
        
        
//        SalariedEmployee e2 = new SalariedEmployee(200, "Tareq", "Yemen", "IT", "@gmail.com", 1000);
//        DailyEmployee e3 = new DailyEmployee(20, 15, "Tareq", "Yemen", "IT", "@gmail.com", 1000);
//        HourlyEmployee e4 = new HourlyEmployee(5, 60, "Tareq", "Yemen", "IT", "@gmail.com", 1000);
        
//        System.out.println("US1: " + e1.getSalary());
//        System.out.println("US2: " + e2.getSalary());
//        System.out.println("US3: " + e3.getSalary());
//        System.out.println("US4: " + e4.getSalary());

    //######################//
        //Overloading//
    //######################//
    
    
    //######################//
      //polymorphic Array//
    //######################//
    
        Employee [] refArray = new Employee[]{new Employee(), new SalariedEmployee(), new DailyEmployee(), new HourlyEmployee()};
        
//        refArray[0] = new Employee();
//        refArray[1] = new SalariedEmployee();
//        refArray[2] = new DailyEmployee();
//        refArray[3] = new HourlyEmployee();
        
//        for (int i = 0; i < refArray.length; i++) {
//            refArray[i].print();
//        }
        
        for(Employee e:refArray) {
//            e.print();
            p(e);
        }
        
        
        int x = 1+2;
        String f = "M" + "N";
    
    }
}
