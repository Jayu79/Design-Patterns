public class Main {

    public static void fillRegistry(StudentRegistry registry){
        Student CS_Student = new Student();
        CS_Student.setAge(24);
        CS_Student.setBatch("2023");

        registry.register("CS_23_Student",CS_Student);

        IntelligentStudent CS_Intelligent_Student = new IntelligentStudent();
        CS_Intelligent_Student.setGrade(4.0);
        CS_Intelligent_Student.setIq(78);

        registry.register("CS_23_Intelligent_Student",CS_Intelligent_Student);

    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student jayanth = registry.get("CS_23_Student").clone();
        jayanth.setName("Jayanth");
        jayanth.setBatch("2022");

        Student intelligentJayanth = registry.get("CS_23_Intelligent_Student").clone();

        if(intelligentJayanth instanceof IntelligentStudent) {
            ((IntelligentStudent) intelligentJayanth).setIq(100);
            System.out.println(((IntelligentStudent) intelligentJayanth).getIq());
        }

        intelligentJayanth.setName("Jayu");
        intelligentJayanth.setAge(24);

        System.out.println("You are good to go!!!");

    }
}