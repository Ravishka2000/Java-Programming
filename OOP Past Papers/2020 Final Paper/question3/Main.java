package question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String pattern1,pattern2;
		int width,count;
		Object lock = new Object();
		
		System.out.print("Enter Textile Pattern 1 = ");
		pattern1 = sc.next();
		System.out.print("Enter Textile Pattern 2 = ");
		pattern2 = sc.next();
		System.out.print("Enter Pattern Width = ");
		width = sc.nextInt();
		System.out.print("Enter Count = ");
		count = sc.nextInt();
		
		PatternThread1 patternThread1 = new PatternThread1(lock, pattern1.charAt(0), count, width);
		Thread patternThread2 = new Thread(new PatternThread2(lock, pattern2.charAt(0), count, width),"Pattern 02 Thread");
		
		patternThread1.setName("Pattern 01 Thread");
		
		System.out.println("========Threads start printing Patterns========");
		
		patternThread1.start();
		patternThread2.start();
		
	}

}
