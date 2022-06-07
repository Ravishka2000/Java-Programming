package Question1;

public class Weekday extends Student{

    private String freeDay;

    public void addDetails(String name,String address,char sex,int bornYear,String specialization,String freeDay) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
        this.freeDay = freeDay;
    }

    @Override
    public void addMark(int m1,int m2,int m3,int m4,int m5) {
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
        marks[4] = m5;
    }

    @Override
    public void showDetails() {
        System.out.println("Student name " + name);
        System.out.println("Student Address " + address);
        System.out.println("Gender " + sex);
        System.out.println("Student year " + bornYear);
        System.out.println("Student Specialization " + specialization);
        System.out.println("Student Freeday " + freeDay);
    }
}
