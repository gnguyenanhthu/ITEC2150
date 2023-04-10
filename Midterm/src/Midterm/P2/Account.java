package Midterm.P2;

import javax.swing.*;

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


}


