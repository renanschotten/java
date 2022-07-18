package app;

import java.util.Scanner;

import generics.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = sc.nextInt();
		PrintService<Integer> ps = new PrintService<Integer>();
		for (int i = 0; i < n; i++) {
			ps.addValue(sc.nextInt());
		}
		ps.print();
		System.out.println("First: " + ps.first());
		sc.close();
	}

}
