package Midterm.P3;

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

        //Set up new variables
        Account.setFEE(10);
        Account.setCheckingMinBalance(101);
        Account.setSavingsMinBalance(1001);
        Account.setCheckingInterestRate(0.001);
        Account.setSavingsInterestRate(0.002);

        System.out.println("\n----End Of Month 1----");
        checkingAccount.endOfMonth();
        System.out.print(checkingAccount);
        savingAccount.endOfMonth();
        System.out.print(savingAccount);

        System.out.println("\n----Withdraw Savings 3 times----");
        savingAccount.withdrawal(100);
        savingAccount.withdrawal(100);
        savingAccount.withdrawal(100);

        System.out.println("\n----End Of Month 2----");
        checkingAccount.endOfMonth();
        System.out.print(checkingAccount);
        savingAccount.endOfMonth();
        System.out.print(savingAccount);

        System.out.println("\n----Withdraw Savings 5325----");
        savingAccount.withdrawal(5325);

        System.out.println("\n----End Of Month 3----");
        checkingAccount.endOfMonth();
        System.out.print(checkingAccount);
        savingAccount.endOfMonth();
        System.out.print(savingAccount);

        System.out.println("\n----Deposit----");
        checkingAccount.deposit(31);
        savingAccount.deposit(9);

        System.out.println("\n----End Of Month 4----");
        checkingAccount.endOfMonth();
        System.out.print(checkingAccount);
        savingAccount.endOfMonth();
        System.out.print(savingAccount);
    }
}
