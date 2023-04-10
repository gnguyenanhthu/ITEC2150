package ClassAssignment_2.q3;
import java.util.ArrayList;
import java.util.Random;

public class AccountOwnerTest {
    public static void main(String[] args) {
        AccountOwner owner1 = new AccountOwner("Alice");
        AccountOwner owner2 = new AccountOwner("Bob");
        owner1.createAccount(1000);
        owner2.createAccount(2000);
        owner2.createAccount(3000);
        owner1.createAccount(4000);
        owner1.createAccount(5000);


        System.out.println(owner1);
        System.out.println(owner2);

        Random random = new Random(2150);
        for (Account account : owner1.getAccounts()) {
            double depositMoney = random.nextDouble() * 100;
            owner1.deposit(account, depositMoney);
        }
        System.out.println(owner1);

        for (Account account : owner2.getAccounts()) {
            double withdrawMoney = random.nextDouble() * 100;
            owner1.withdraw(account, withdrawMoney);
        }


        owner2.setName("Brian");
        System.out.println(owner2);

        owner2.withdraw(owner1.getAccounts().get(0),1000);

        //System.out.println("Withdrawal denied: You are not the owner of the account");
    }}













