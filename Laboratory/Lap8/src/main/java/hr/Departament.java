package hr;

public class Departament {
    String deptName;
    int deptid;

    public Departament(String deptName, int deptid) {
        this.deptName = deptName;
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
    
    
}
