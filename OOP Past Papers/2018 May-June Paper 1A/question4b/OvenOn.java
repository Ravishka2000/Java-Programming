package question4b;

public class OvenOn implements Command {

	Oven oven = new Oven("Blue");
		
	public OvenOn(Oven oven) {
		super();
		this.oven = oven;
	}

	@Override
	public void execute() {
		oven.on();
	}

}
