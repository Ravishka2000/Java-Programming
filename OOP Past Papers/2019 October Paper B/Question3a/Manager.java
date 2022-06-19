package Question3a;

public class Manager implements IEmployee{

    private String managerID;
    private double salary;

    public Manager(String managerID, double salary) {
        this.managerID = managerID;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager ID = " + managerID + ", Salary = " + salary);
    }
}
