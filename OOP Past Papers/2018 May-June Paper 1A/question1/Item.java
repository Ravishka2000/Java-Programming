package question1;

public abstract class Item {

	protected int itemNo;
	protected String description;
	protected double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void display() {
		
		System.out.println("Item No : " + itemNo);
		System.out.println("Description : " + description);
		System.out.println("Unit Price : " + unitPrice);
		
	}
	
}
