package question4;

public class FishFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour() {
        System.out.println("Added Fish for the Meal");
    }

    @Override
    public double getCost() {
        return 80.0;
    }
}
