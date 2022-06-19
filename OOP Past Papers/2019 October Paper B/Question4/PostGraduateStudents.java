package Question4;

public class PostGraduateStudents extends Students{
    @Override
    public void displayStudents() {
        offerPrograms();
        conductEvent();
        displayCost();
        System.out.println("Display Post Graduate Students");
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the postgraduate program is = " + iPrograms.getCost());
    }
}
