package Midterm.P6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ComparableAccountsTest {
    public static void main(String[] args){
        ArrayList<Account> accounts = new ArrayList<Account>();
        Random rand = new Random(2150);
        for (int i = 0; i < 5; i++) {
            double deposit = (1 + rand.nextInt((6-1)+1))*100;
            accounts.add(new Checking(deposit));
            deposit = (1 + rand.nextInt((6-1)+1))*100;
            accounts.add(new Savings(deposit));
        }

        Collections.sort(accounts);
        System.out.println(accounts);
    }
}
