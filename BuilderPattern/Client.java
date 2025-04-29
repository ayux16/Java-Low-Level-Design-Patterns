package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        //Builder builder = new Builder();
//        Builder builder=Student.getBuilder();
//        builder.setName("Ayush");
//        builder.setAge(26);
//        builder.setGender("Male");
//        builder.setPsp(97.5);
//        builder.setGradYear(2025  );
//
//        //Student student=new Student(builder);
//        Student student=builder.build();
//        System.out.println("DEBUG");
        Student student=Student.getBuilder()
                .setName("Ayush")
                .setAge(26)
                .setPsp(97.80)
                .setGender("Male")
                .setRoll_no(63)
                .build();
        System.out.println(student);
    }

}
