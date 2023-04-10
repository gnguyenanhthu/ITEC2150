package ClassAssignment_2.q3;

import java.util.ArrayList;

public class AccountOwner {
    private static int numOwners;
    private int ownerID;
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public AccountOwner(String name) {
        this.name = name;
        ++numOwners;
        ownerID = numOwners;

    }

    public static int getNumOwners() {
        return numOwners;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createAccount(double initialbalance) {
        Account account = new Account(this, initialbalance);
        accounts.add(account);
    }

    public void deposit(Account accounts, double amount) {
        accounts.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        System.out.println("Withdrawal denied: Amount to withdraw cannot exceed the balance)");
    }
    public double totalBalance() {
            double sum = 0;
            for (int i=0; i< accounts.size(); i++) {
                sum = sum + accounts.get(i).getBalance();
            }
        return sum;
        }

    @Override
    public String toString() {
        return String.format("OwnerID: %d, Name: %s, Accounts: %s, Total Balance: %.2f", ownerID, name, accounts.toString(), totalBalance());

    }


    }


