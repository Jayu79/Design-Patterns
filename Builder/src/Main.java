public class Main {
    public static void main(String[] args) {
//        Student.Builder builder = new Student.Builder();
//        builder.setAge(24);
//        builder.setName("Jayanth");
//        builder.setGrade(4.0);
//        builder.setUniversityName("MUST");
//
//        Student Jayanth = builder.build();
//
//        System.out.println(Jayanth.age+" "+Jayanth.grade+" "+Jayanth.id);

//        Student Jayanth = Student.getBuilder().setName("Jayanth").setAge(17).setGrade(4.0).build();
//        System.out.println(Jayanth.age+" "+Jayanth.Name+" "+Jayanth.UniversityName);

        Student Jayanth = Student.getBuilder().setName("Jayanth").setAge(24).setGrade(4.0).build();
        System.out.println(Jayanth.age+" "+Jayanth.Name+" "+Jayanth.UniversityName+" "+Jayanth.PhoneNumber);
    }
}