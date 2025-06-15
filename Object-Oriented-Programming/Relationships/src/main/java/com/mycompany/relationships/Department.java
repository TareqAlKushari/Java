package com.mycompany.relationships;

public class Department {
    private int deptNo;
    private String deptName;

    public Department() {
    }

    public Department(int deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" + "deptNo=" + deptNo + ", deptName=" + deptName + '}';
    }
    
    
}
