package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("Health expanses: ");
				double healthExpanses = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpanses));
			} else {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				list.add(new Company(name, anualIncome, employeesNumber));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID");
		double totalTaxes = 0.0;
		for (TaxPayer tp : list) {
			System.out.printf(tp.getName() + ": $ %.2f%n", tp.taxValue());
			totalTaxes += tp.taxValue();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTaxes);
		sc.close();
	}

}
