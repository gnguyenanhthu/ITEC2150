package ch2a_1_encapsulation_mimirBankAccount;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1111222233334444L, 0);
		account.deposit(100);
		account.deposit(-100);
		account.deposit(200);
		
		System.out.println(account);

		Scanner in = new Scanner(System.in);
		System.out.println("How much do you want to withdraw?");
		double amount = in.nextDouble();
		if (account.withdraw(amount)) {
			System.out.printf("Here are your $%.2f\n", amount);
		}
		else {
			System.out.println("Withdrawal not successful.");
			System.out.println("Withdrawal amount must be positive and not excedding balance.\n");
		}
		System.out.println(account);
	}
}
