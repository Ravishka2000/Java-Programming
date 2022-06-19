package Question1;

public class RemoteController {
    private int Switch;
    private ISensor iSensor[];
    private IMotionTracker iMotionTracker[];

    public RemoteController(int aSwitch, ISensor[] iSensor, IMotionTracker[] iMotionTracker) {
        Switch = aSwitch;
        this.iSensor = iSensor;
        this.iMotionTracker = iMotionTracker;
    }

    public void startService(){

        if(Switch == 0 ){
            iSensor[Switch].on();
        }
        else if (Switch == 1){
            iSensor[Switch].on();
        }
    }

    public void stopService(){

        if(Switch == 0 ){
            iSensor[Switch].off();
        }
        else if (Switch == 1){
            iSensor[Switch].off();
        }
    }

    public void locationService(){
        iMotionTracker[Switch].displayLocation();
    }
}
