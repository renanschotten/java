package app;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.name = "Joao Silva";
		emp.grossSalary = 6000.00;
		emp.tax = 1000.00;

		System.out.printf("Employee: %s, $ %.2f%n ", emp.name, emp.netSalary());
		emp.increaseSalary(10.0);
		System.out.println("Percentage salary increase? 10.0");
		System.out.printf("Employee: %s, $ %.2f", emp.name, emp.netSalary());
	}

}
