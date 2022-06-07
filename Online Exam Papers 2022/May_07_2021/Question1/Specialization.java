package Question1;

import java.util.HashMap;
import java.util.Map;

public class Specialization {
    Map<String,Double> spemap = new HashMap<>();

    public void addSpecialization(String specialization,double gpa) {
        spemap.put(specialization,gpa);
    }

    public void displaySpecializations() {
        for (Map.Entry<String,Double> ob: spemap.entrySet()){
            System.out.println(ob.getKey() + " : " + ob.getValue());
        }
    }
}
