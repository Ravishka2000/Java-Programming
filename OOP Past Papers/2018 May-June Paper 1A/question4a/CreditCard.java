package question4a;

public class CreditCard {
	
	private static CreditCard uniqueInstance;
	
	private CreditCard() {
		
	}
	
	public static CreditCard getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new CreditCard();
		}
		return uniqueInstance;
	}
	
	public boolean validate(String cardno, int code) {
		if(cardno.length() == 16 && code%3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
