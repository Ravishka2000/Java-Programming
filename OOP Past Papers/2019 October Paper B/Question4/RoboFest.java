package Question4;

public class RoboFest implements IFestival{
    @Override
    public void performEvent() {
        System.out.println("Perform RoboFest event for " + getBudget());
    }

    @Override
    public double getBudget() {
        return 800000;
    }
}
