package question1a;

public class PrintThread extends Thread{

    @Override
    public void run() {
        for(int i = 1 ; i <= 10 ; ++i){
            System.out.println(i);
        }
    }
}
