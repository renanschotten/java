package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudantes;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos serao alugados? ");
		int n = sc.nextInt();
		Estudantes[] estudantes = new Estudantes[10];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Aluguel %d%n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			estudantes[room] = new Estudantes(name, email);
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < estudantes.length;i++) {
			if(estudantes[i] != null) {
				System.out.printf("%d: %s%n", i, estudantes[i].toString());
			}
			
		}
		sc.close();
	}

}
