package question2a;

import java.util.ArrayList;

public class GenericPersonDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("STD1111",6));
        students.add(new Student("STD2222",7));
        students.add(new Student("STD3333",12));
        students.add(new Student("STD4444",11));
        students.add(new Student("STD5555",10));

        ArrayList<Lecturer> lecturers = new ArrayList<>();
        lecturers.add(new Lecturer("EMP0000","IT"));
        lecturers.add(new Lecturer("EMP1111","SE"));
        lecturers.add(new Lecturer("EMP2222","CSN"));
        lecturers.add(new Lecturer("EMP3333","EE"));
        lecturers.add(new Lecturer("EMP4444","IS"));

        GenericPerson genericPerson = new GenericPerson();
        genericPerson.displayElements(students);
        System.out.println("");
        genericPerson.displayElements(lecturers);
    }
}
