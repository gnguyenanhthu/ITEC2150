package Midterm.P3;

public class Savings extends Account {
    public Savings(double initialDeposit) {
        super(initialDeposit);
    }

    @Override
    public String toString() {
        return "Savings{Account Number: " + getAccountNumber() + ", balance: " + balance + "\n";
    }

    private int numWithdrawals = 0;

    public int getNumWithdrawals() {
        return numWithdrawals;
    }
    @Override
    public void withdrawal(double amount){
        try {
            if (numWithdrawals >= getSavingsMaxWithdrawals())
            {
                throw new RuntimeException();
            }
            super.withdrawal(amount);
            if (amount > 0 && amount < balance) {
                numWithdrawals += 1;
            }
            //System.out.println("Number of withdrawal:" + numWithdrawals);
        }
       catch (RuntimeException ex){
            System.out.println("You have reached the maximum number of withdrawals for the month");
            System.out.print(toString());
       }
    }

    @Override
    public void endOfMonth(){
        if (balance < savingsMinBalance){
            balance -= FEE;
        }
        balance += balance*savingsInterestRate;
        numWithdrawals = 0;
    }

}
