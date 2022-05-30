package question3;

public class TestThread {
    public static void main(String[] args) {

        Object lock = new Object();
        Thread plusThread = new Thread(new PlusThread(lock,2,10));
        Thread multiplyThread = new Thread(new MultiplyThread(lock,2,10));
        plusThread.start();
        multiplyThread.start();
    }
}
