package ClassAssignment_2.q2;

import java.util.ArrayList;
public class Account {
    private static int numAccounts = 0;

    private int accountNumber;
    private double balance;

    public Account() {
        balance = 0;
        numAccounts +=1;
        accountNumber = numAccounts;
    }
    public Account(double balance) {

        this.balance = balance;
        numAccounts +=1;
        accountNumber = numAccounts;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public static double averageBalance (ArrayList<Account> accounts){
        double sum = 0;
        for (int i=0; i< accounts.size(); i++) {
             sum+=i;
        }
        return sum/ accounts.size();
    }
    public double getBalance() {
        return balance;
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Withdrawal denied: Amount to withdraw cannot exceed the balance");
            return;
        }

        balance -= amount;
    }

}

