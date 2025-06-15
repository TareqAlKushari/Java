/*
    *Relationships:-
        - Association:

        - Aggregation:
            ."has-a" relationships
            .weak relationships
        - Composition:
            ."part-of" relationships
            .strong relationships

 */
package com.mycompany.relationships;

public class Main {
    
    public static void main(String[] args) {
        //PersonalInformation PersonalInfo = new PersonalInformation("Tareq", "Mohammed", "Al-kushari", "O+", "1234", "Jordanian", 1999);
        Department dept = new Department(123, "IT");
        Employee  emp = new Employee(1, 2500, "Tareq", "Mohammed", "Al-kushari", "O+", "1234", "Jordanian", 1999, dept);
        //Employee  emp2 = new Employee(2, 2500, "Tareq", "Mohammed", "Al-kushari", "O+", "1234", "Jordanian", 1999, dept);
        
        System.out.println(emp.toString());
    }
}
