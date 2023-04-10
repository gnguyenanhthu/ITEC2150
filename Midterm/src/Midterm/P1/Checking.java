package Midterm.P1;

public class Checking extends Account{
    public Checking(double initialDeposit) {
        super(initialDeposit);
    }

    @Override
    public String toString() {
        return "Checking{Account Number: " + getAccountNumber() + ", balance: " + balance + "\n";
    }
}
