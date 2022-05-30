package question3;

@SuppressWarnings("serial")
public class MarksException extends Exception {
	
	private float marks;

	public MarksException(float marks) {
		super();
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}
	
	

}
