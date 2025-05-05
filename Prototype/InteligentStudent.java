package Prototype;

public class InteligentStudent  extends Student{
    private int iq;

    InteligentStudent(InteligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public InteligentStudent copy() {
        return new InteligentStudent(this);
    }
}
