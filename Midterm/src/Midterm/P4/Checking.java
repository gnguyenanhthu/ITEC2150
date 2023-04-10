package Midterm.P4;

public class Checking extends Account {
    public Checking(double initialDeposit) {
        super(initialDeposit);
    }

    @Override
    public String toString() {
        return "Checking{Account Number: " + getAccountNumber() + ", balance: " + balance + "}\n";
    }

    @Override
    public void endOfMonth(){
        if (balance < checkingMinBalance){
            balance -= FEE;
        }
        balance += balance*checkingInterestRate;
    }
}
