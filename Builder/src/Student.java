public class Student {


    String Name;
    int age;
    double grade;
    String UniversityName;
    long id;
    int gradYear;
    long PhoneNumber;

    private Student(Builder b){
        this.Name = b.Name;
        this.age = b.getAge();
        this.grade = b.getGrade();
        this.UniversityName = b.getUniversityName();
        this.id = b.getId();
        this.gradYear = b.getGradYear();
        this.PhoneNumber = b.getPhoneNumber();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String Name;
        int age;
        double grade;
        String UniversityName;
        long id;
        int gradYear;
        long PhoneNumber;

        public String getName(){
            return Name;
        }

        public Builder setName(String Name){
            this.Name = Name;
            return this;
        }

        public int getAge(){
            return age;
        }

        public Builder setAge(int Age){
            this.age = Age;
            return this;
        }

        public double getGrade(){
            return grade;
        }

        public Builder setGrade(double grade){
            this.grade = grade;
            return this;
        }

        public String getUniversityName() {
            return UniversityName;
        }

        public Builder setUniversityName(String universityName) {
            UniversityName = universityName;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public long getPhoneNumber() {
            return PhoneNumber;
        }

        public Builder setPhoneNumber(long phoneNumber) {
            PhoneNumber = phoneNumber;
            return this;
        }

        public boolean validate(){
            return this.age >= 18;
        }
        public Student build(){

            if(!validate()){
                throw new RuntimeException("Age is not in range");
            }

            return new Student(this);
        }
    }

}
