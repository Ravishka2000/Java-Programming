package question4;

public class Lunch extends Meal{

    public Lunch() {
        System.out.println("\nPreparing Lunch......");
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