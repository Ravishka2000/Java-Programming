package question4;

public abstract class Meal {
    IPrepareQuickly iPrepareQuickly;
    IPrepareDeliciously iPrepareDeliciously;

    public void setDuration(IPrepareQuickly iPrepareQuickly) {
        this.iPrepareQuickly = iPrepareQuickly;
    }

    public void setFlavour(IPrepareDeliciously iPrepareDeliciously) {
        this.iPrepareDeliciously = iPrepareDeliciously;
    }

    public void mealWithFlavour(){
        iPrepareDeliciously.addFlavour();
    }

    public void mealInDuration(){
        iPrepareQuickly.deliveryTime();
    }

    public abstract void displayMeal();

    public abstract void displayCost();

}
