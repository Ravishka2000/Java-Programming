package question3;

public class PlusThread extends Thread {

    Object lock;
    int start;
    int range;

    public PlusThread(Object lock, int start, int range) {
        this.lock = lock;
        this.start = start;
        this.range = range;
    }

    public void addNumbers(){
        synchronized (lock){
            try {
                for (int i = start ; i <= range ; ++i){
                    lock.wait();
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + " => " + i +" + " + i + " = " + (i+i));
                    lock.notify();
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Thread-0");
        addNumbers();
    }

}
