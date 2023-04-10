package Midterm.P4;


import java.util.ArrayList;
import java.util.Random;

public class AverageBalanceTest {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        Random rand = new Random(2150);
        for (int i = 0; i < 10; i++) {
            double deposit = 1 + rand.nextInt((1000-1)+1);
            accounts.add(new Checking(deposit));
            deposit = 1 + rand.nextInt((1000-1)+1);
            accounts.add(new Savings(deposit));
        }

        double savingsAverage = Account.averageBalance(accounts,true);
        double checkingAverage = Account.averageBalance(accounts,false);

        System.out.println("The average balance of Savings accounts is " + savingsAverage);
        System.out.println("The average balance of Checking accounts is " + checkingAverage);


    }
}
