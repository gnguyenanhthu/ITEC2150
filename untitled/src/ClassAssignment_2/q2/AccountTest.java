package ClassAssignment_2.q2;

import java.util.ArrayList;
import java.util.*;
public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account();
        System.out.println(account1);


        Random rand = new Random();
        ArrayList<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            accounts.add(new Account(rand.nextDouble() * 1000000));
        }
        System.out.println(accounts);

        System.out.println(Account.getNumAccounts());

        double averageBalance = Account.averageBalance(accounts);
        System.out.printf("Average Balance: %.2f", averageBalance);

    }
}




