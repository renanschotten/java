package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\file_and_buffered_writer\\items.csv";
		String createdPath = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\file_and_buffered_writer\\out";
		String targetPath = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\file_and_buffered_writer\\out\\summary.csv";
		boolean success = new File(createdPath).mkdir();
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double value = Double.parseDouble(fields[1]);
				int qtd = Integer.parseInt(fields[2]);
				products.add(new Product(name, value, qtd));
				line = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath, true))) {
				for(Product p : products) {
					bw.write(p.toString());
					bw.newLine();
				}
				System.out.println("File created");
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
