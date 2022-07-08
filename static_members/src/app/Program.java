package app;

import java.util.Locale;
import java.util.Scanner;

import utils.Calculator;
import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * double radius = 3.0; double circ = Calculator.circumference(radius); double
		 * volume = Calculator.volume(radius);
		 * 
		 * System.out.printf("%.2f%n",circ); System.out.printf("%.2f%n",volume);
		 */
		System.out.print("Dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amountBought = sc.nextDouble();
		double amountPaidInReais = CurrencyConverter.amountReais(dollarPrice, amountBought);
		System.out.printf("%.2f%n", amountPaidInReais);
		sc.close();
	}

}
