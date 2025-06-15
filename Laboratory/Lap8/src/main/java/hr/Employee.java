package hr;

public class Employee {
    private String name;
    private static int id;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        Employee.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void claTax()
    {
        salary =salary - salary*0.05;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + " id = " + Employee.id + '}';
    }
    
}
