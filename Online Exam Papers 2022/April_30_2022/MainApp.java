package April_30_2022;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) throws IncorrectValues {

        ArrayList<AlarmClock> alarmClocks = new ArrayList<>();

        AlarmClock alarmClock1 = new AlarmClock();
        AlarmClock alarmClock2 = new AlarmClock();

        alarmClock1.inputAlarm();
        alarmClock2.setAlarm(8,30,00);

        alarmClocks.add(alarmClock1);
        alarmClocks.add(alarmClock2);

        for(AlarmClock alarmClock : alarmClocks){
            alarmClock.showAlarm();
        }
    }
}
