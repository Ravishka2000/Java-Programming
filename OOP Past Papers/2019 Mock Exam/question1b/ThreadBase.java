package question1b;

public class ThreadBase {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumbersThread());
        Thread thread2 = new Thread(new NumbersThread());
        Thread thread3 = new Thread(new NumbersThread());

        thread1.setName("Red");
        thread2.setName("Blue");
        thread3.setName("Green");

        thread1.start();
        thread2.start();
        thread3.start();

        for (int i = 0 ; i < 100 ; ++i){
            System.out.println("SLIIT");
        }

        if(thread1.isAlive()){
            System.out.println(thread1.getState());
        }
        
    }
}
