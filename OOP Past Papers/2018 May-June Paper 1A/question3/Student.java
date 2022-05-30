package question3;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Student {

	private int id, noOfSubjects;
	private String names;
	private float[] marks;
	
	Scanner sc = new Scanner(System.in);
	
	public Student(int id, String names) {
		super();
		this.id = id;
		this.names = names;
	}
	
	public float inputMarks(int index) throws MarksException {
		
		System.out.println("Enter mark " + index + " : ");
		float mark = sc.nextFloat();
		
		if(mark < 0 || mark > 100) {
			throw new MarksException(mark);
		}
		else {
			return mark;
		}
	}
	
	public void input() {
		
		try {
			System.out.println("Enter No of Subjects : ");
			this.noOfSubjects = sc.nextInt();
			
			this.marks = new float[noOfSubjects];
			
			for(int i = 0 ; i < noOfSubjects ; ++i) {
				marks[i] = inputMarks(i+1);
			}
		} catch (MarksException e) {
			e.printStackTrace();
			System.out.println("Not a Valid Mark");
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}	
	}
	
	public float getAverage() {
		float tot = 0 ,avg = 0;
		
		for(int i = 0 ; i < noOfSubjects ; ++i) {
			tot += marks[i];
		}
		
		try {
			avg = tot/noOfSubjects;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		return avg;
	}
	
}
