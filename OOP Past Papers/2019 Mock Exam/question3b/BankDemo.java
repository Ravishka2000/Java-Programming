package question3b;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double withdraw;
        String choice;

        Account account = new Account(123);
        System.out.println("Depositing Rs.10 000");
        account.deposit(10000.00);

        while(true) {
            try {
                System.out.print("Please enter amount to be withdrawn : ");
                withdraw = sc.nextDouble();

                System.out.println("Withdrawing Rs." + withdraw + "/=");
                account.withdraw(withdraw);

                System.out.println("Existing amount = " + account.getBalance());

            } catch (InsufficientBalanceException e) {
                System.out.println("Sorry,Your Account remains only Rs." + e.getAmount());
                System.out.println("\n");
                e.printStackTrace();
                System.out.println("Do you wish to continue? yes/no");
                choice = sc.next();

                if(choice.equalsIgnoreCase("yes")){
                    System.out.println("Depositing Rs.10 000");
                    account.deposit(10000.00);
                    continue;
                }
                else{
                    break;
                }
            }
        }
    }
}
