package question4;

public class ChickenFlavour implements IPrepareDeliciously{
    @Override
    public void addFlavour() {
        System.out.println("Added Chicken for the Meal");
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
