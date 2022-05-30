package question1;

public class SatelliteLocation implements IGeoLocation{

    String location;

    public SatelliteLocation(String location) {
        this.location = location;
    }

    @Override
    public void displayLocation() {
        System.out.println("Satellite Location is = " + location);
        System.out.println("");
    }
}
