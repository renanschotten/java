package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\funcional\\stream_exercise\\in.txt";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary: ");
		double salaryFilter = sc.nextDouble();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				// System.out.println(line);
				String[] str = line.split(",");
				list.add(new Employee(str[0], str[1], Double.parseDouble(str[2])));
				line = br.readLine();
			}
			List<String> email = list.stream().filter(x -> x.getSalary() > salaryFilter).map(p -> p.getEmail()).sorted()
					.collect(Collectors.toList());

			email.forEach(System.out::println);

			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0,
					(x, y) -> x + y);
			System.out.print("Sum of salary of people whose name starts with 'M': ");
			System.out.printf("%.2f%n", sum);
		} catch (IOException e) {
			System.out.println("e: " + e.getMessage());
		}
		sc.close();
	}

}
