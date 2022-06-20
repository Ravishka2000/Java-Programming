package question3;

public class PatternThread2 implements Runnable{
	private Object ob;
	private char pattern;
	private int count,width;
	
	public PatternThread2(Object ob, char pattern, int count, int width) {
		this.ob = ob;
		this.pattern = pattern;
		this.count = count;
		this.width = width;
	}

	public void run() {
		synchronized (ob) {
			try {
				for(int i = 0 ; i < count ; ++i) {
					ob.notify();
					Thread.sleep(1000);
					System.out.print(Thread.currentThread().getName() + " = ");
					for(int j = 0 ; j < width ; ++j) {
						System.out.print(pattern);
					}
					System.out.println();
					ob.wait();
				}
			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

}
