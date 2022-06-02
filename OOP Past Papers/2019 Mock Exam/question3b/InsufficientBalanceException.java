package question3b;

public class InsufficientBalanceException extends Exception{

    private double amount;

    public InsufficientBalanceException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
