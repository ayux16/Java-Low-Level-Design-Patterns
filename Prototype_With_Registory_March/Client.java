package Prototype_With_Registory_March;
import Prototype_With_Registory_March.Registery.StudentRegistry;

public class Client {
    public static void main(String[] args) {
        Student s=new Student();
//        InteligentStudent i=new InteligentStudent();
//
//        Student t=s.copy();
//        InteligentStudent i2=i.copy();

        StudentRegistry studentRegistery=new StudentRegistry();
        s.setName("Ayush");
        s.setRollNo(12334);
        s.setBatch("March2026");
        studentRegistery.add("March26",s);
        studentRegistery.get("March26").copy();
        studentRegistery.add("April25",s);
        studentRegistery.get("April25").copy();
    }
}
