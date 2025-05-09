package Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String gender;
    private String batch;
    private String major;

    Student (Student student){
        this.name = student.name;
        this.age = student.age;
        this.gender = student.gender;
        this.batch = student.batch;
        this.major = student.major;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
