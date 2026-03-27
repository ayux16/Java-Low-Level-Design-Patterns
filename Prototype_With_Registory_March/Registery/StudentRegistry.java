package Prototype_With_Registory_March.Registery;



import Prototype.Prototype;
import Prototype_With_Registory_March.Student;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> students;

    public StudentRegistry() {
        students = new HashMap<>();
    }

    public void add(String key, Student student) {
        students.put(key, student);
    }

    public void remove(String key){
        students.remove(key);
    }

    public Student get(String key){
       return students.get(key);
    }
}
