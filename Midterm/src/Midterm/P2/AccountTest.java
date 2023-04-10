package Midterm.P2;

public class AccountTest {
    public static void main(String[] args){
        System.out.println("----Test Checking Acount----");
        Checking checkingAccount = new Checking(1000);
        checkingAccount.withdrawal(-100);
        checkingAccount.withdrawal(500);
        checkingAccount.deposit(-200);
        checkingAccount.deposit(2000);
        checkingAccount.withdrawal(800);
        checkingAccount.withdrawal(1600);
        checkingAccount.withdrawal(200);

        System.out.println("\n----Test Savings Acount----");
        Account.setSavingsMaxWithdrawals(2);
        Savings savingAccount = new Savings(5000);
        savingAccount.withdrawal(-300);
        savingAccount.withdrawal(600);
        savingAccount.deposit(-400);
        savingAccount.deposit(3000);
        savingAccount.withdrawal(9000);
        savingAccount.withdrawal(900);
        savingAccount.withdrawal(1000);

    }
}
