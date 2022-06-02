package question1a;

public class SLIITThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; ++i){
            System.out.println("SLIIT");
        }
    }
}
