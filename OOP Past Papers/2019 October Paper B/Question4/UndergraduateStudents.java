package Question4;

public class UndergraduateStudents extends Students{
    @Override
    public void displayStudents() {
        offerPrograms();
        conductEvent();
        displayCost();
        System.out.println("Display Under Graduate Students");
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the undergraduate program is = " + iPrograms.getCost());
    }
}
