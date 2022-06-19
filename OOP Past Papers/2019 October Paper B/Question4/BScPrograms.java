package Question4;

public class BScPrograms implements IPrograms{
    @Override
    public void offerPrograms() {
        System.out.println("Offer BSc Programs");
    }

    @Override
    public double getCost() {
        return 120000;
    }
}
