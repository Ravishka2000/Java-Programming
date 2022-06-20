package question3;

public class PatternThread1 extends Thread {
	private Object ob;
	private char pattern;
	private int count,width;
	
	public PatternThread1(Object ob, char pattern, int count, int width) {
		this.ob = ob;
		this.pattern = pattern;
		this.count = count;
		this.width = width;
	}

	public void run() {
		synchronized (ob) {
			try {
				for(int i = 0 ; i < count ; ++i) {
					ob.wait();
					Thread.sleep(1000);
					System.out.print(Thread.currentThread().getName() + " = ");
					for(int j = 0 ; j < width ; ++j) {
						System.out.print(pattern);
					}
					System.out.println();
					ob.notify();
				}
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}
