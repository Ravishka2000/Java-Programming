package Question4;

public class GameFest implements IFestival{
    @Override
    public void performEvent() {
        System.out.println("Perform GameFest event for " + getBudget());
    }

    @Override
    public double getBudget() {
        return 400000;
    }
}
