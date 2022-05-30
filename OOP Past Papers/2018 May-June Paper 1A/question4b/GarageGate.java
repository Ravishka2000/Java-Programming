package question4b;

public class GarageGate {

	private String description;

	public GarageGate(String description) {
		super();
		this.description = description;
	}
	
	public void open() {
		System.out.println("Open " + this.description);
	}
	
	public void close() {
		System.out.println("Close " + this.description);
	}
}
