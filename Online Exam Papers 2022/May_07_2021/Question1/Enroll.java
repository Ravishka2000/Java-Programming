package Question1;

import java.util.HashMap;
import java.util.Map;

public class Enroll {

    Map<String,String> smap = new HashMap<>();

    public void enrollStudent(String studentid, String specialization) {
        smap.put(studentid,specialization);
    }

    public void displayEnrolledStudents() {
        for (Map.Entry<String,String> ob: smap.entrySet()){
            System.out.println(ob.getKey() + " : " + ob.getValue());
        }
    }
}
