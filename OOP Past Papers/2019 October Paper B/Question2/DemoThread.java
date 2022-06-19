package Question2;

public class DemoThread {
    public static void main(String[] args) {
        DemoThread demoThread = new DemoThread();
        Thread addNumbers = new Thread(new AddNumbers(demoThread,10,20),"Add");
        Thread multiplyNumbers = new Thread(new MultiplyNumbers(demoThread,10,20),"Mul");
        addNumbers.start();
        multiplyNumbers.start();
    }
}
