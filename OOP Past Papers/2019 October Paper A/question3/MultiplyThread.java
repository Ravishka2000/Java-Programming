package question3;

public class MultiplyThread extends Thread{

    Object lock;
    int start;
    int range;

    public MultiplyThread(Object lock, int start, int range) {
        this.lock = lock;
        this.start = start;
        this.range = range;
    }

    public void multiplyNumbers(){

        synchronized (lock){
            try {
                for (int i = start ; i <= range ; ++i) {
                    lock.notify();
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + " => " + i + " x " + i + " = " + (i * i));
                    lock.wait();
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Thread-1");
        multiplyNumbers();
    }

}
