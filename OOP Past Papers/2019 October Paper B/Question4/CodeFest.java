package Question4;

public class CodeFest implements IFestival{
    @Override
    public void performEvent() {
        System.out.println("Perform CodeFest event for " + getBudget());
    }

    @Override
    public double getBudget() {
        return 300000;
    }
}
