package Question1;

public class SensorLocation implements IMotionTracker{

    private String location;

    @Override
    public void displayLocation() {
        System.out.println("Sensor Location is = " + location);
        System.out.println("");
    }

    public SensorLocation(String location) {
        this.location = location;
    }

}
