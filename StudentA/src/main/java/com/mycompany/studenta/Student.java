package com.mycompany.studenta;

public class Student {
    private String studentName;
    private int studentID;
    private String academicLevel;
    
    public void setStudent(String studentName, int studentID, String academicLevel){
        this.studentName = studentName;
        this.studentID = studentID;
        this.academicLevel = academicLevel;
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", studentID=" + studentID + ", academicLevel=" + academicLevel + '}';
    }
    
    public String getStudent(int ID){
        return this.toString();
    }
}
