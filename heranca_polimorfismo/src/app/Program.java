package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		for(int i = 0; i<3;i++) {
			System.out.print("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
		}
		
		sc.close();
	}

}
