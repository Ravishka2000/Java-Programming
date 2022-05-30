package question2a;

public class CalcSum implements Runnable {

	@Override
	public void run() {
		
		int tot = 0 ;
		
		for(int i = 1 ; i < 100000 ; ++i) {
			
			tot += i;
		}
		
		System.out.println("Sum : " + tot);
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
	
	
}