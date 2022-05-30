package question1;

public class SatelliteDemo {

    public static void main(String[] args) {

        ISatellite navigationalSatellite = new NavigationSatellite("Ravana-01");
        IGeoLocation locationTracker1 = new SatelliteLocation("Sri Lanka");

        ISatellite droneSatellite = new DroneSatellite("Ravana-02");
        IGeoLocation locationTracker2 = new SatelliteLocation("Russia");

        ISatellite droneSatellite2 = new DroneSatellite("Appachchi-01");
        IGeoLocation locationTracker3 = new SatelliteLocation("Madamulana");

        ISatellite[] satelliteArray = new ISatellite[]{navigationalSatellite,droneSatellite,droneSatellite2};
        IGeoLocation[] trackerArray = new IGeoLocation[]{locationTracker1,locationTracker2,locationTracker3};

        SatelliteCenter satelliteCenter = new SatelliteCenter(0,satelliteArray,trackerArray);
        satelliteCenter.startService();
        satelliteCenter.stopService();
        satelliteCenter.locationService();

        SatelliteCenter remoteController2 = new SatelliteCenter(1,satelliteArray,trackerArray);
        remoteController2.startService();
        remoteController2.stopService();
        remoteController2.locationService();

        SatelliteCenter remoteController3 = new SatelliteCenter(2,satelliteArray,trackerArray);
        remoteController3.startService();
        remoteController3.stopService();
        remoteController3.locationService();
    }
}
