package app;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		InterestService is = new BrazilInterestService(1.0);
		System.out.println("Payment after 3 months: ");
		System.out.printf("%.2f", is.payment(amount, months));
	}

}
