package question4;

public class Dinner extends Meal{

    public Dinner() {
        System.out.println("\nPreparing Dinner......");
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