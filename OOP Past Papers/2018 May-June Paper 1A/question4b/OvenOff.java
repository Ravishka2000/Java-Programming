package question4b;

public class OvenOff implements Command{

	Oven oven = new Oven("Red");
	
	
	
	public OvenOff(Oven oven) {
		super();
		this.oven = oven;
	}



	@Override
	public void execute() {
		oven.off();
	}

}
