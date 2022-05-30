package question2a;

import java.util.ArrayList;

public class GenericPerson <T extends IPerson>{

    public void displayElements(ArrayList<T> objects){

        for (T ob : objects) {
            ob.displayDetails();
        }
    }
}
