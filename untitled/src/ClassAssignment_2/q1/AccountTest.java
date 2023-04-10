package ClassAssignment_2.q1;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account(1000);
        System.out.println(account1);

        account1.withdraw(400);
        System.out.println(account1);

        account1.deposit(2000);
        System.out.println(account1);
        System.out.println();

        Account account2 = new Account();
        System.out.println(account2);

        account2.deposit(1500);
        System.out.println(account2);
        System.out.println();

        account2.withdraw(3000);
        System.out.println("Withdrawal denied: Amount to withdraw cannot exceed the balance)");

        System.out.println(account2);
    }
}

