package question2b;

public class Calculation {

	private double ans;

	public double getAns() {
		return ans;
	}
	
	public void factorial(int start,int end) {
		ans =1;
		
		for(int i = start ; i <= end ; ++i) {
			ans = ans*i;
		}
	}
}
