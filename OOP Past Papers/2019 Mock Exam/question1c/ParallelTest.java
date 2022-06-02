package question1c;

public class ParallelTest {
    public static void main(String[] args) throws InterruptedException {

        Calculation calculation = new Calculation();

        Thread thread1 = new Thread(new Thread1(calculation,1,50000));
        Thread thread2 = new Thread(new Thread1(calculation,50001,100000));

        try {
            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Total : " + calculation.getTotal());

    }
}
