package question4;

public class Truck extends Vehicle{

    double weight;

    public Truck(double speed, double regularPrice, String colour, double weight) {
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    @Override
    public double getRegularPrice() {
        if(weight > 2000){
            super.regularPrice = regularPrice - regularPrice*10/100;
        }
        else{
            super.regularPrice = regularPrice - regularPrice*20/100;
        }
        return regularPrice;
    }
}
