package question4;

public class Breakfast extends Meal{

    public Breakfast() {
        System.out.println("\nPreparing Breakfast......");
    }

    @Override
    public void displayMeal() {
        mealWithFlavour();
        mealInDuration();
        displayCost();
    }

    @Override
    public void displayCost() {
        System.out.println("Cost for the meal is = " + iPrepareDeliciously.getCost());
    }
}
