package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de itens: ");
		int n = sc.nextInt();
		double sum = 0;
		Product[] vet = new Product[n];
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double value = sc.nextDouble();
			vet[i] = new Product(name, value);
		}
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i].getValue();
		}
		System.out.printf("Media: %.2f%n", sum / vet.length);

		sc.close();

	}

}
