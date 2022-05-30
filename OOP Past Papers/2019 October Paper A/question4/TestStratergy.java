package question4;

public class TestStratergy {
    public static void main(String[] args) {
        Meal meal = new Breakfast();
        meal.setFlavour(new ChickenFlavour());
        meal.setDuration(new ThirtyMinutes());
        meal.displayMeal();

        Meal meal2 = new Lunch();
        meal2.setFlavour(new FishFlavour());
        meal2.setDuration(new OneHour());
        meal2.displayMeal();

        Meal meal3 = new Dinner();
        meal3.setFlavour(new EggFlavour());
        meal3.setDuration(new FourtyFiveMinutes());
        meal3.displayMeal();
    }
}
