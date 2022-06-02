package question4;

public abstract class Vehicle {
    double speed;
    double regularPrice;
    String colour;

    public Vehicle(double speed, double regularPrice, String colour) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.colour = colour;
    }

    public Vehicle(double speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }

    public double getRegularPrice() {
        return this.regularPrice;
    }
}
