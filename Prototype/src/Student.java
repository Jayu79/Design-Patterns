public class Student implements Prototype<Student>{

    private int age;
    private String name;
    private String batch;
    private double grade;

    public Student(){

    }
    public Student(Student student){
        this.age = student.getAge();
        this.name = student.getName();
        this.batch = student.getBatch();
        this.grade = student.getGrade();
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGrade(Double grade){
        this.grade = grade;
    }

    public Double getGrade(){
        return grade;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }

    public String getBatch(){
        return batch;
    }
    public Student clone(){
        return new Student(this);
    }

}
