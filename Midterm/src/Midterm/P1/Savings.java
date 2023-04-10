package Midterm.P1;

public class Savings extends Account{
    public Savings(double initialDeposit) {
        super(initialDeposit);
    }

    @Override
    public String toString() {
        return "Savings{Account Number: " + getAccountNumber() + ", balance: " + balance + "\n";
    }
}
