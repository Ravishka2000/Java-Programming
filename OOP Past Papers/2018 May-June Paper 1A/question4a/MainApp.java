package question4a;

public class MainApp {

	public static void main(String[] args) {
			
		CreditCard c1 = CreditCard.getInstance();
		CreditCard c2 = CreditCard.getInstance();
		
		if(c1.validate("1111111111111111", 3333)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		if(c2.validate("22222",500)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		System.out.println(c1.equals(c2));
	}

}
