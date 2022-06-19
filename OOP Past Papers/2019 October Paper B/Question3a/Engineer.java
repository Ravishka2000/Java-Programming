package Question3a;

public class Engineer implements IEmployee{

    private String employeeID;
    private String company;

    public Engineer(String employeeID, String company) {
        this.employeeID = employeeID;
        this.company = company;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Engineer = " + employeeID + ", Company = " + company);
    }
}
