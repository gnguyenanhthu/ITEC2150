package Midterm.P5;

import java.util.ArrayList;

public abstract class Account {
    private static int numAccounts;
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

    protected static double checkingMinBalance, savingsMinBalance;
    protected static double checkingInterestRate, savingsInterestRate;

    public static double getCheckingMinBalance() {
        return checkingMinBalance;
    }

    public static void setCheckingMinBalance(double checkingMinBalance) {
        Account.checkingMinBalance = checkingMinBalance;
    }

    public static double getSavingsMinBalance() {
        return savingsMinBalance;
    }

    public static void setSavingsMinBalance(double savingsMinBalance) {
        Account.savingsMinBalance = savingsMinBalance;
    }

    public static double getCheckingInterestRate() {
        return checkingInterestRate;
    }

    public static void setCheckingInterestRate(double checkingInterestRate) {
        Account.checkingInterestRate = checkingInterestRate;
    }

    public static double getSavingsInterestRate() {
        return savingsInterestRate;
    }

    public static void setSavingsInterestRate(double savingsInterestRate) {
        Account.savingsInterestRate = savingsInterestRate;
    }

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

    public void deposit(double amount){
        try {
            if (amount <= 0)
            {
                throw new IllegalArgumentException();
            }
            balance += amount;
            System.out.print(toString());

        } catch (IllegalArgumentException ex){
            System.out.printf("Illegal Argument %.2f: the amount of deposit must be positive\n",amount);
            System.out.print(toString());

        }
    }
    public void withdrawal(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException();
            }
            if (amount > balance) {
                throw new IllegalArgumentException();
            }
            balance -= amount;
            System.out.print(toString());
        } catch (IllegalArgumentException ex) {
            if (amount <= 0)
                System.out.printf("Illegal Argument %.2f: the amount of withdraw must be positive\n", amount);
            else
                System.out.printf("Illegal argument %.1f : the amount of withdrawal cannot exceed the balance\n",amount);
            System.out.print(toString());
        }
    }
    protected static int savingsMaxWithdrawals;

    public static int getSavingsMaxWithdrawals() {
        return savingsMaxWithdrawals;
    }

    public static void setSavingsMaxWithdrawals(int savingsMaxWithdrawals) {
        Account.savingsMaxWithdrawals = savingsMaxWithdrawals;
    }

    public void endOfMonth(){};

    public static double averageBalance(ArrayList<Account> accounts, boolean savings){
        double sum = 0, count = 0;
        if (savings){
            for (Account s : accounts){
                if (s instanceof Savings){
                    sum += s.balance;
                    ++count;
                }
            }
        } else {
            for (Account s : accounts){
                if (s instanceof Checking){
                    sum += s.balance;
                    ++count;
                }
            }
        }
        return sum/count;
    }

    public static ArrayList<Account> maxBalanceAccounts (ArrayList<Account> accounts){
        ArrayList<Account> maxBalanceAccounts = new ArrayList<Account>();
        double maxBalance = 0;
        for(Account a : accounts){
            if (a.balance > maxBalance){
                if (!maxBalanceAccounts.isEmpty()){
                    maxBalanceAccounts.clear();
                }
                maxBalanceAccounts.add(a);
                maxBalance = a.balance;
                continue;
            }
            if (a.balance == maxBalance){
                maxBalanceAccounts.add(a);
            }
        }
        return maxBalanceAccounts;
    }

}


