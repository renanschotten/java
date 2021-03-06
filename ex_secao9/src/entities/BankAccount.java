package entities;

public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	private static final double WITHDRAW_TAX = 5.00;

	public BankAccount(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value + WITHDRAW_TAX;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}
}
