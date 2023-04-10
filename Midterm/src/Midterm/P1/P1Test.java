package Midterm.P1;

// Uncomment the code in the main method
// Do NOT modify the existing code
// ONLY add code to the end of the main method

import java.util.ArrayList;
import java.util.Random;

public class P1Test {

    public static void main(String[] args) {

        double minOpenDeposit = 50;
        Account.setMinOpenDeposit(minOpenDeposit);
        ArrayList<OpenAccount> openAccounts = new ArrayList<>();
        Random rand = new Random(2150);

        int n = 10;
        for (int i = 0; i < n; i++) {
            boolean savings = rand.nextBoolean();
            double deposit = rand.nextInt(3 * (int) minOpenDeposit) - minOpenDeposit / 2;
            openAccounts.add(new OpenAccount(savings, deposit));
        }

        System.out.println(openAccounts);
        System.out.println();

        ArrayList<Account> accounts = new ArrayList<Account>();
        Savings savingAccount1 = new Savings(64.0);
        Savings savingAccount2 = new Savings(10.0);
        Savings savingAccount3 = new Savings(56.0);
        Checking checkingAccount1 = new Checking(103.0);
        Savings savingAccount4 = new Savings(73.0);
        Checking checkingAccount2 = new Checking(35.0);
        Checking checkingAccount3 = new Checking(78.0);
        Savings savingAccount5 = new Savings(51.0);
        Checking checkingAccount4 = new Checking(63.0);
        Checking checkingAccount5 = new Checking(45.0);

        accounts.add(savingAccount1);
        accounts.add(savingAccount2);
        accounts.add(savingAccount3);
        accounts.add(savingAccount4);
        accounts.add(savingAccount5);
        accounts.add(checkingAccount1);
        accounts.add(checkingAccount2);
        accounts.add(checkingAccount3);
        accounts.add(checkingAccount4);
        accounts.add(checkingAccount5);

        System.out.println(accounts);
    }

}

class OpenAccount {

    boolean savings;
    double deposit;

    public OpenAccount(boolean savings, double deposit) {
        this.savings = savings;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "OpenAccount{" +
                "savings=" + savings +
                ", deposit=" + deposit +
                "}\n";
    }
}
