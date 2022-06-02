package question1b;

public class NumbersThread implements Runnable{

    @Override
    public void run() {
        for(int i = 1 ; i <= 100 ; ++i){
            System.out.println(Thread.currentThread().getName() + "-->" + i );
        }
    }
}
