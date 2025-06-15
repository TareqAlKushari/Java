package com.mycompany.finalkeyword;

final public class Student {
    final int STUDENT_ID;
    String name;
    int yearOfBirth;
    final static float DEGREE_OF_STUDENT;
    
    static{
        DEGREE_OF_STUDENT = 50;
    }
    
    {
        System.out.println("Student Block");
        STUDENT_ID = 55; 
    }

    public Student(final int STUDENT_ID, String name, int yearOfBirth) {
        System.out.println("Student Constructor");
        //this.STUDENT_ID = STUDENT_ID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    final public String toString() {
        return "Student{" + "STUDENT_ID=" + STUDENT_ID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + '}';
    }
    
    
}

//class GraduatedStudent extends Student{
//    @Override
//    public String toString() {
//        return "Student{" + "STUDENT_ID=" + 675 + ", name=" + name + ", yearOfBirth=" + yearOfBirth + '}';
//    }
//}
