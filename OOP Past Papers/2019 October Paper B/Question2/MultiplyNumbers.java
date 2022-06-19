package Question2;

public class MultiplyNumbers extends Thread{

    private DemoThread demoThread;
    private int start;
    private int end;

    public MultiplyNumbers(DemoThread demoThread, int start, int end) {
        this.demoThread = demoThread;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        multiplyNumbers();
    }

    public void multiplyNumbers(){
        synchronized (demoThread){
            try {
                for (int i = start; i <= end; ++i) {
                    demoThread.notify();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " => " + i + " (*) " + i + " = " + (i*i));
                    demoThread.wait();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
