package question2b;

public class ParallelThread extends Thread{
	
	Calculation myCalc;
	int start,end;
		
	public ParallelThread(Calculation myCalc, int start, int end) {
		super();
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}



	public void run() {
		
		myCalc.factorial(start, end);
		
	}

}
