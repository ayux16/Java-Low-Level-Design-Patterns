package Prototype_With_Registory_March;

public class InteligentStudent extends Student{
    private int iq;

    InteligentStudent(){

    }

    //actuall copying of obj
    InteligentStudent(InteligentStudent inteligentStudent){
        super(inteligentStudent);
        this.iq=inteligentStudent.iq;
    }

    //manage || Start the copying process
    public InteligentStudent copy(){
        InteligentStudent copy=new InteligentStudent(this);
        return copy;
        //we can use Super to copy the method
        //but that will create Student obj also
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
