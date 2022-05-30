package question2a;

public class Student implements IPerson{
    String studentID;
    int grade;

    public Student(String studentID, int grade) {
        this.studentID = studentID;
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID : " + studentID + ", Grade : " + grade);
    }
}
