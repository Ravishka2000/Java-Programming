package Question3a;

import java.util.ArrayList;

public class  GenericEmployee <T extends IEmployee> {

    public void showElements(ArrayList<T> arrayList){

        for(T employee: arrayList){
            employee.showEmployeeDetails();
        }

        System.out.println("");
    }
}
