package Prototype_With_Registory_March;

import Prototype.Prototype;

public class Student {
    private String name;
    private int rollNo;
    private String Batch;

    Student(){

    }
    Student(Student student){
        this.name = student.name;
        this.rollNo = student.rollNo;
        this.Batch = student.Batch;
    }
    public Student copy(){
        Student student=new Student(this);
        return student;
        //Copy from copyConstructor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }
}
