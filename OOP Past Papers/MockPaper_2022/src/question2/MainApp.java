package question2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Object ob = new Object();
        String pattern1,pattern2;
        int count;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pattern 1 = ");
        pattern1 = sc.next();

        System.out.print("Enter Pattern 2 = ");
        pattern2 = sc.next();

        System.out.print("Enter Count = ");
        count = sc.nextInt();

        Thread thread1 = new Thread(new Thread1(pattern1.charAt(0),count,ob));
        Thread thread2 = new Thread(new Thread2(pattern2.charAt(0),count,ob));

        thread1.start();
        thread2.start();

    }
}
