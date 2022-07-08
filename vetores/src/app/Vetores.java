package app;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de itens: ");
		int n = sc.nextInt();
		double sum = 0;
		double[] vet = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a altura %d: ", i + 1);
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			sum += vet[i];
		}
		System.out.printf("Media: %.2f%n", sum / n);

		sc.close();
	}
}
