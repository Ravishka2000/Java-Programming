package question1;

public class SatelliteCenter {
    private int option;

    ISatellite[] iSatellites;
    IGeoLocation[] iGeoLocations;

    public SatelliteCenter(int option, ISatellite[] iSatellites, IGeoLocation[] iGeoLocations) {
        this.option = option;
        this.iSatellites = iSatellites;
        this.iGeoLocations = iGeoLocations;
    }

    public void startService(){
        if (option == 0){
            iSatellites[0].activate();
        }
        else if (option == 1){
            iSatellites[1].activate();
        }
        else if (option == 2) {
            iSatellites[2].activate();
        }
    }

    public void stopService(){
        if (option == 0){
            iSatellites[0].deactivate();
        }
        else if (option == 1){
            iSatellites[1].deactivate();
        }
        else if (option == 2) {
            iSatellites[2].deactivate();
        }
    }

    public void locationService(){
        if (option == 0){
            iGeoLocations[0].displayLocation();
        }
        else if (option == 1){
            iGeoLocations[1].displayLocation();
        }
        else if (option == 2) {
            iGeoLocations[2].displayLocation();
        }
    }
}
