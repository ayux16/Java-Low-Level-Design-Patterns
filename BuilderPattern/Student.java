package BuilderPattern;

public class Student {
    private String Name;
    private int age;
    private String gender;
    private double psp;
    private int batch;
    private int roll_no;
    private int gradYear;
    public static Builder getBuilder() {
        return new Builder();
    }
    private Student(Builder builder) {
        if(builder.getGradYear()>2024){
            throw new IllegalArgumentException("Grad year should be 2024");
        }
        this.Name=builder.getName();
        this.age=builder.getAge();
        this.gender=builder.getGender();
        this.psp=builder.getPsp();
        this.batch=builder.getBatch();
        this.roll_no=builder.getRoll_no();
        this.gradYear=builder.getGradYear();
    }
    static class Builder {
        private String Name;
        private int age;
        private String gender;
        private double psp;
        private int batch;
        private int roll_no;
        private int gradYear;

        public Student build() {
            return new Student(this);
        }
        public String getName() {
            return Name;
        }
        public Builder setName(String name) {
            Name = name;
            return this;
        }
        public int getAge() {
            return age;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public String getGender() {
            return gender;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public double getPsp() {
            return psp;
        }
        public  Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public int getBatch() {
            return batch;
        }
        public  Builder setBatch(int batch) {
            this.batch = batch;
            return this;
        }
        public int getRoll_no() {
            return roll_no;
        }
        public  Builder setRoll_no(int roll_no) {
            this.roll_no = roll_no;
            return this;
        }
        public int getGradYear() {
            return gradYear;
        }
        public  Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }
}
