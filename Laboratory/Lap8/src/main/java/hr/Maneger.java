package hr;

public class Maneger extends Employee {
    private Departament dept;

    public Maneger(Departament dept, String name, double salary) {
        super(name, salary);
        this.dept = dept;
    }

    public Departament getDept() {
        return dept;
    }

    public void setDept(Departament dept) {
        this.dept = dept;
    }
    public void claTax()
    {
      super.setSalary(super.getSalary()-(super.getSalary()*0.10));
    }

    
    public void printAll() {
       System.out.println(super.toString());
        System.out.println("DEPT NAME :"+dept.getDeptName()+"  dept ID :"+dept.deptid);
       
    }
   
}
