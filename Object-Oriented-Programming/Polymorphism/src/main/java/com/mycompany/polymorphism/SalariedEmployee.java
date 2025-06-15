package com.mycompany.polymorphism;

public class SalariedEmployee extends Employee {
    float bouns;
    protected int x;
    

    SalariedEmployee() {}
    
    @Override
    public void print() {
        System.out.println("SalariedEmployee");
    }
    
    // Static methods cannot be annotated with @Override
//    public static void print() {
//        System.out.println("Sup-Class");
//    }
    
    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
    
    @Override
    public float getSalary() {
        return super.getSalary() + bouns;
    }

    public SalariedEmployee(float bouns, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }
    
    
}
