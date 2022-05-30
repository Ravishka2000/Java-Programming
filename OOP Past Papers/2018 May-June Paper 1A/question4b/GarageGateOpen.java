package question4b;

public class GarageGateOpen implements Command{

	GarageGate gg = new GarageGate("Front Gate");
	
	public GarageGateOpen(GarageGate gg) {
		super();
		this.gg = gg;
	}

	@Override
	public void execute() {
		gg.open();
	}

}
