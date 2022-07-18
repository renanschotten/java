package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String filePath = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\comparable_interface\\in.txt";

		List<Employee> arr = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String name = br.readLine();
			while (name != null) {
				String[] employee = name.split(",");
				arr.add(new Employee(employee[0], employee[1]));
				name = br.readLine();
			}
			Collections.sort(arr);
			for (Employee e : arr) {
				System.out.println(e.toString());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
