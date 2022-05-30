package question4b;

public class GarageGateClose implements Command{

	GarageGate gg = new GarageGate("Rollar Gate");
	
	public GarageGateClose(GarageGate gg) {
		super();
		this.gg = gg;
	}

	@Override
	public void execute() {
		gg.close();
	}

}
