package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\re_sc\\Documents\\programacao\\java\\ws-eclipse\\generics_1\\in.txt";
		List<Product> arr = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] str = line.split(",");
				arr.add(new Product(str[0], Double.parseDouble(str[1])));
				line = br.readLine();
			}
			Product prd = CalculationService.max(arr);
			System.out.println(prd);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
