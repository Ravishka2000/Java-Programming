package question1;

public class Car extends Item{

	private String model;
	private String type;
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}
	
	public void display() {
		
		System.out.println("\n\nCar No : " + itemNo);
		System.out.println("Description : " + description);
		System.out.println("Model : " + model);
		System.out.println("Type : " + type);
		System.out.println("Unit Price : " + unitPrice);
		
	}
}
