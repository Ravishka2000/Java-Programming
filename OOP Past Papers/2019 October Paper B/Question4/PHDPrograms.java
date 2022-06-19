package Question4;

public class PHDPrograms implements IPrograms{
    @Override
    public void offerPrograms() {
        System.out.println("Offer PHD Programs");
    }

    @Override
    public double getCost() {
        return 6000000;
    }
}
