package question1;

public class DroneSatellite implements ISatellite{

    String name;

    public DroneSatellite(String name) {
        this.name = name;
    }

    @Override
    public void activate() {
        System.out.println(name + " Drone satellite Activate");
    }

    @Override
    public void deactivate() {
        System.out.println(name + " Drone satellite Deactivate");
    }
}
