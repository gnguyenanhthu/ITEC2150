package Midterm.P1;

public abstract class Account {
    private static int numAccounts = 0;
    private static double MIN_OPEN_DEPOSIT;

    public static void setMinOpenDeposit(double minOpenDeposit) {
        MIN_OPEN_DEPOSIT = minOpenDeposit;
    }

    public static double getMinOpenDeposit() {
        return MIN_OPEN_DEPOSIT;
    }
    protected static double FEE;

    public static double getFEE() {
        return FEE;
    }

    public static void setFEE(double FEE) {
        Account.FEE = FEE;
    }

    protected int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    protected double balance;

    public double getBalance() {
        return balance;
    }
    public Account(double initialDeposit){
        try {
            if (initialDeposit < this.MIN_OPEN_DEPOSIT)
                throw new IllegalArgumentException();
            balance = initialDeposit;
            ++numAccounts;
            accountNumber = numAccounts;
        }
        catch (IllegalArgumentException ex)
        {
            System.out.printf("Illegal Argument %.2f: the initial deposit must be at least %.2f\n",initialDeposit, MIN_OPEN_DEPOSIT);
        }
    }

}
