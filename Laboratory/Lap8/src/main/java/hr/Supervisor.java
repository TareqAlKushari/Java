package hr;

public class Supervisor extends Employee {
    Departament dept;

    public Supervisor(Departament dept, String name, double salary) {
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
      super.setSalary(super.getSalary()-(super.getSalary()*0.20));
    }
     public void printAll() {
       System.out.println(super.toString());
        System.out.println("DEPT NAME : "+dept.getDeptName()+"  Dept ID :"+dept.deptid);
       
    }
}
