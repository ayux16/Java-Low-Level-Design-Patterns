package Prototype;

import java.util.Map;

public class StudentRegistery {
    private Map<String,Student> registry;
    public void put(String Key, Student student) {
        registry.put(Key,student);
    }
    public Student get(String Key) {
        return registry.get(Key);
    }
}
