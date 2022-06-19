package Question4;

public class MScPrograms implements IPrograms{
    @Override
    public void offerPrograms() {
        System.out.println("Offer MSc Programs");
    }

    @Override
    public double getCost() {
        return 500000;
    }
}
