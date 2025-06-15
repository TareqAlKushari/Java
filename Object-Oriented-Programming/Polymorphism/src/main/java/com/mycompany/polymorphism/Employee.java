package com.mycompany.polymorphism;

public class Employee {
    private String name, address, department, email;
    private float salary;
    protected int x;
    

    Employee() {}
    
    //Method Overriding:
    public void print() {
        System.out.println("Employee");
    }
    
    //Method Overloading:
//    public static void print(int r) {
//        System.out.println("Base-Class");
//    }
//    
//    public static void print(int r, int p) {
//        System.out.println("Base-Class");
//    }
    
    //Method Overriding:
//    public static void print() {
//        System.out.println("Base-Class");
//    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, String department, String email, float salary) {
        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }
    
    
}
