package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department`s name: ");
		String departmentsName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workersName = sc.nextLine();
		System.out.print("Level: ");
		String workersLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double workersBaseSalary = sc.nextDouble();
		Worker worker = new Worker(workersName, WorkerLevel.valueOf(workersLevel), workersBaseSalary, new Department(departmentsName));
		
		System.out.print("How many contracts? ");
		int contractsNumber = sc.nextInt();
		
		for(int i = 1; i<=contractsNumber; i++) {
			System.out.println("Enter contract #"+i+" data: ");
			System.out.print("Date (DD/MM/YYYY)");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			int duration = sc.nextInt();
			worker.addContract(new HourContract(contractDate, valuePerHour, duration));	
		}
		System.out.println();
		System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": "+ worker.income(year, month));
		sc.close();
	}

}
