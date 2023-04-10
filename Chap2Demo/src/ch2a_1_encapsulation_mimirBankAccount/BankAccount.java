package ch2a_1_encapsulation_mimirBankAccount;

/**
 * Class: BankAccount
 *
 */
public class BankAccount {
	private long   accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	/** 
	* Deposit a specific amount money to the bank account.
	*
	* Increase the balance by the deposit amount. If the amount if negative,
	* do nothing and return false. Otherwise, increase the balance and 
	* return true.
	* 
	* @param amount	   the deposit amount
	* @return          true if deposit is successful
	*                  false otherwise.
	*                  */
	//TODO1: define the deposit method below
	public boolean deposit(double amount) {
		return false;
	}

	
	/** 
	* Withdraw a specific amount money from the bank account.
	*
	* If the amount is not exceeding the balance, reduce the balance 
	* by the withdrawal anount and return true. Otherwise, balance is
	* not changed and return false.
	* 
	* @param amount	   the withdrawal amount
	* @return          true if withdrawal is successful
	*                  false otherwise.
	*/
	//TODO2: define the withdraw method below
	public boolean withdraw(double amount) {
		return false;
	}

	

 	//Why is there not a setBalance method as follows in BankAcount in the previous problem?
    /*
	public void setBalance(double balance) {
		this.balance = balance;
	}*/
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
