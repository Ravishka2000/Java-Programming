package question3;

public class MainApp {

	public static void main(String[] args) {
		
		Student s = new Student(111, "Ravishka");
		s.input();
		
		System.out.println(s.getAverage()); 
	}

}
