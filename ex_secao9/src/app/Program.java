package app;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String accountData = "Account Data:";
		String updatedAccountData = "Updated Account Data:";
		double initialDepositValue = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		BankAccount bankAccount = new BankAccount(name, accountNumber);
		System.out.print("Is there an initial deposit?(y/n): ");
		char hasInitalDeposit = sc.next().charAt(0);
		if (hasInitalDeposit == 'y') {
			System.out.print("Enter initial value: ");
			initialDepositValue = sc.nextDouble();
			bankAccount.deposit(initialDepositValue);
		}
		System.out.println(accountData);
		System.out.println(bankAccount.toString());
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bankAccount.deposit(depositValue);
		System.out.println(updatedAccountData);
		System.out.println(bankAccount.toString());

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankAccount.withdraw(withdrawValue);
		System.out.println(updatedAccountData);
		System.out.println(bankAccount.toString());
		
		sc.close();
	}

}
