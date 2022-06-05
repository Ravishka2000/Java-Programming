package April_30_2022;

import java.util.Scanner;

public class AlarmClock {
    private int hour;
    private int minute;
    private int second;

    Scanner sc = new Scanner(System.in);

    public AlarmClock(){
        this.hour = 12;
        this.minute = 0;
        this.second = 0;
    }

    public void inputAlarm() throws IncorrectValues{
        try {
            System.out.print("Set Hour : ");
            this.hour = sc.nextInt();
            System.out.print("Set Minute : ");
            this.minute = sc.nextInt();
            System.out.print("Set Second : ");
            this.second = sc.nextInt();

            if(!(hour > 0 && hour <=12)) {
                throw new IncorrectValues("Hour should be between 0 to 12");
            }
            if(!(minute > 0 && minute < 60)) {
                throw new IncorrectValues("Minute should be between 0 to 59");
            }
            if(!(second > 0 && second < 60)) {
                throw new IncorrectValues("Second should be between 0 to 59");
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (IncorrectValues i){
            System.out.println(i.getMessage());
        }
    }

    public void showAlarm(){
        System.out.println("Alarm : " + hour + ":" + minute + ":" + second);
    }

    public void setAlarm(int hour,int minute, int second){
        if(hour > 0 && hour <=12) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
        if(minute > 0 && minute < 60) {
            this.minute = minute;
        }
        else{
            this.minute = 0;
        }
        if(second > 0 && second < 60) {
            this.second = second;
        }else {
            this.second = 0;
        }
    }
}
