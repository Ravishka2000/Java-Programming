package question4b;

public class MobileUI {

	Command[] cmdArray;

	public MobileUI() {
		cmdArray = new Command[8];
	}
	
	public void setCommand(int index,Command cmdobj) {
		cmdArray[index] = cmdobj;
	}
	
	public void commmandPressed(int index) {
		cmdArray[index].execute();
	}
}
