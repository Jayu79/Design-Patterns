public class IntelligentStudent extends Student{

    int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.getIq();
    }

    public void setIq(int iq){
        this.iq = iq;
    }

    public int getIq(){
        return iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

}
