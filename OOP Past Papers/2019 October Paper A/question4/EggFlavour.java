package question4;

public class EggFlavour implements IPrepareDeliciously{
    @Override
    public void addFlavour() {
        System.out.println("Added Egg for the Meal");
    }

    @Override
    public double getCost() {
        return 60.0;
    }
}
