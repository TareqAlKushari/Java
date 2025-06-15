package com.mycompany.polymorphism;

public class DailyEmployee extends Employee {
    private float workDayPrice;
    private int dailyRate;
    
    
    DailyEmployee() {}
    
    @Override
    public void print() {
        System.out.println("DailyEmployee");
    }

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    
    @Override
    public float getSalary() {
        return workDayPrice * dailyRate;
    }

    public DailyEmployee(float workDayPrice, int dailyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }
    
    
}
