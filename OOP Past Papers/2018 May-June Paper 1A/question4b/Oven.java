package question4b;

public class Oven {

	private String name;

	public Oven(String name) {
		super();
		this.name = name;
	}
	
	public void on() {
		System.out.println("Turned on " + this.name + " Oven..");
	}
	
	public void off() {
		System.out.println("Turned off " + this.name + " Oven..");
	}
}
