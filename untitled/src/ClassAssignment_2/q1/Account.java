package ClassAssignment_2.q1;
public class Account {
    private double balance;

    public Account() {
        balance = 0;
    }
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
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

    @Override
    public String toString() {
        String str = String.format("Balance: %.2f", balance);
        return str;
    }

}

