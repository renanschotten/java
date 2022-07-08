package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> emp = new ArrayList<>();
		for(int i =0; i<n;i++) {
			System.out.printf("Employee #%d%n", i+1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			emp.add(new Employee(id, name, salary));
		}
		
		System.out.print("Employee ID that will receive a raise: ");
		int searchId = sc.nextInt();
		Employee em = emp.stream().filter(x -> x.getId() == searchId).findFirst().orElse(null);
		if(em == null) {
			
			System.out.println("Non existent");
		}else {
			System.out.print("Percentage icrease: ");
			double percentage = sc.nextDouble();
			em.increaseSalary(percentage);
		}
		
		for(Employee value : emp) {
			System.out.println(value.toString());
		}
	}

}
