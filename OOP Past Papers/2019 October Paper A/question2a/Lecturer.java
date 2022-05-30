package question2a;

public class Lecturer implements IPerson{
    String employeeID;
    String department;

    public Lecturer(String employeeID, String department) {
        this.employeeID = employeeID;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Lecturer: " + employeeID + ", Department : " + department);
    }
}
