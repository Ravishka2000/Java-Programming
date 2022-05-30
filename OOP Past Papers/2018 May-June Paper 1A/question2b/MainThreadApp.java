package question2b;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {

		Calculation calculation = new Calculation();
		
		ParallelThread p1 = new ParallelThread(calculation, 1, 10);
		ParallelThread p2 = new ParallelThread(calculation, 11, 20);
		ParallelThread p3 = new ParallelThread(calculation, 21, 30);
		ParallelThread p4 = new ParallelThread(calculation, 31, 40);
		
		p1.start();
		p1.join();
		
		p2.start();
		p2.join();
		
		p3.start();
		p3.join();
		
		p4.start();
		p4.join();
		
		System.out.println("\nFactorial of 40 : " + calculation.getAns());
		
	}

}
