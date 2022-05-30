package question2a;

public class MainThreadApp {

	public static void main(String[] args) {
		CountDown cd = new CountDown();

		Thread t1 = new Thread(new CalcSum());
		Thread t2 = new Thread(new CalcSum());
		
		t1.setName("Black");
		t2.setName("White");
		
		cd.start();
		
		try {
			cd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
	}

}
