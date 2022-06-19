package Question2;

public class AddNumbers extends Thread{

    private DemoThread demoThread;
    private int start;
    private int end;

    public AddNumbers(DemoThread demoThread, int start, int end) {
        this.demoThread = demoThread;
        this.start = start;
        this.end = end;
    }

    public void addNumbers(){
        synchronized (demoThread){
            try {
                for (int i = start; i <= end; ++i) {
                    demoThread.wait();
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " => " + i + " (+) " + i + " = " + (i+i));
                    demoThread.notify();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        addNumbers();
    }
}
