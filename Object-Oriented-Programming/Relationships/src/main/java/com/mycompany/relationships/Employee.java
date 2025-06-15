package com.mycompany.relationships;

public class Employee {
    private int id;
    private float salary;
    private PersonalInformation personalIndo; // relationship Composition or Aggregation?
    private Department dept; // relationship Composition or Aggregation?

    public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept) {
        this.id = id;
        this.salary = salary;
//        this.personalIndo = personalIndo;
        this.personalIndo = new PersonalInformation(firstName,middleName,lastName,bloodGroup,accountNumber,nationality,yearOfBirth);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + ", personalIndo=" + personalIndo.toString() + ", DeptNo=" + dept.toString() + '}';
    }
    
    
    
}
