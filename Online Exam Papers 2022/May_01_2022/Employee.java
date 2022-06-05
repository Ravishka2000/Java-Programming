package May_01_2022;

import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    protected String empID,name,address;

    public Employee(String empID, String name, String address) {
        this.empID = empID;
        this.name = name;
        this.address = address;
    }

    public void read(){
        System.out.print("Enter Employee ID : ");
        this.empID = sc.next();
        System.out.print("Enter Employee Name : ");
        this.name = sc.next();
        System.out.print("Enter Employee Address : ");
        this.address = sc.next();
    }

    public void print(){
        System.out.println("Employee ID : " + empID);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Address : " + address);
    }
}
