package com.mycompany.inheritance;

public class Developer extends Employee {
    String projectName;
    
    public Developer() {
        System.out.println("Sub-Class");
    }

    public Developer(String name, String emailAddress, String phone, String department, String address, int yearOfBirth, String projectName) {
        super(name, emailAddress, phone, department, address, yearOfBirth);
        this.projectName = projectName;
    }
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    
}
