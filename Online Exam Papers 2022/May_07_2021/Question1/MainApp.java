package Question1;

public class MainApp {
    public static void main(String[] args) throws IDInvalidException {

        Weekend student1 = new Weekend();
        student1.addDetails("Jane","Malabe",'F',1990,"DS","QA");
        String studentid = student1.generateID();
        student1.addMark(56,34,12,46,78);
        student1.showDetails();
        System.out.println("Student ID : " + studentid);
        System.out.println();

        Weekday student2 = new Weekday();
        student2.addDetails("Jim","Kaluthara",'M',1991,"SE","Tuesday");
        String studentid2 = student2.generateID();
        student2.addMark(78,89,45,87,90);
        student2.showDetails();
        System.out.println("Student ID : " + studentid2);
        System.out.println();

        Enroll sem1 = new Enroll();
        sem1.enrollStudent(studentid,"IT");
        sem1.enrollStudent(studentid2,"SE");
        System.out.println("\nEnrolled Student Details ");
        sem1.displayEnrolledStudents();

        Specialization spe = new Specialization();
        spe.addSpecialization("SE",2.75);
        spe.addSpecialization("DS",3.5);
        System.out.println("\nSpecialization Details ");
        spe.displaySpecializations();

    }

}
