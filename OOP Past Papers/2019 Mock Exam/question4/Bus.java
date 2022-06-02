package question4;

public class Bus extends Vehicle{
    int year;
    double manufacturerDiscount;

    public Bus(double speed, double regularPrice, String colour, int year, double manufacturerDiscount) {
        super(speed, regularPrice, colour);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getRegularPrice() {
        return super.regularPrice - manufacturerDiscount;
    }
}
