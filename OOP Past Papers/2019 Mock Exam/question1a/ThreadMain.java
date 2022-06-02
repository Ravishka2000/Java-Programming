package question1a;

public class ThreadMain {
    public static void main(String[] args) {
        Thread sliitThread = new Thread(new SLIITThread());
        PrintThread printThread = new PrintThread();

        printThread.start();
        sliitThread.start();
    }
}
