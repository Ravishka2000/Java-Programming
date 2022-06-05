package May_01_2022;

import java.util.ArrayList;

public class EmployeeApp {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("1111","Kamal","Matara");
        Employee emp2 = new Employee("2222","Nimal","Colombo");
        Employee emp3 = new Manager("3333","Saman","Galle", "HR",2000,3000,4000);
        Employee emp4 = new Manager("4444","Amal","Hambanthota","IT",8000,9000,7000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for (Employee e : employees){
            e.print();
        }
    }
}
