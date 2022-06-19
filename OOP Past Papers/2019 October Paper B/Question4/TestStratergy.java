package Question4;

public class TestStratergy {
    public static void main(String[] args) {

        Students poStudents = new PostGraduateStudents();
        poStudents.setFestival(new CodeFest());
        poStudents.setPrograms(new MScPrograms());
        poStudents.displayStudents();

        System.out.println();

        Students unStudents = new UndergraduateStudents();
        unStudents.setFestival(new RoboFest());
        unStudents.setPrograms(new BScPrograms());
        unStudents.displayStudents();
    }
}
