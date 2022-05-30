package question4b;

public class MainApp {

	public static void main(String[] args) {

		MobileUI mobileui = new MobileUI();
		
		Oven mainOven = new Oven("Red");
		GarageGate garagegate = new GarageGate("Main Gate");
		
		Oven blueOven = new Oven("Blue");
		GarageGate frontGate = new GarageGate("Front Gate");
		
		OvenOn ono2 = new OvenOn(blueOven);
		OvenOff offo2 =new OvenOff(blueOven);
		
		GarageGateOpen opg2 = new GarageGateOpen(frontGate);
		GarageGateClose clg2 = new GarageGateClose(frontGate);
		
		
		mobileui.setCommand(0, new OvenOn(mainOven));
		mobileui.setCommand(1, new OvenOff(mainOven));
		mobileui.setCommand(2, new GarageGateOpen(garagegate));
		mobileui.setCommand(3, new GarageGateClose(garagegate));
		mobileui.setCommand(4, ono2);
		mobileui.setCommand(5, offo2);
		mobileui.setCommand(6, opg2);
		mobileui.setCommand(7, clg2);

		mobileui.commmandPressed(0);
		mobileui.commmandPressed(1);
		mobileui.commmandPressed(2);
		mobileui.commmandPressed(3);
		mobileui.commmandPressed(4);
		mobileui.commmandPressed(5);
		mobileui.commmandPressed(6);
		mobileui.commmandPressed(7);
	}

}
