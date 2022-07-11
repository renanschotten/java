package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Product product;
		List<Product> products = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Product #"+ (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			char state = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(state == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
			}else if(state == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufDate = sdf.parse(sc.next());
				product = new UsedProduct(name, price, manufDate);
			} else {
				product = new Product(name, price);
			}
			products.add(product);
		}
		System.out.println("PRICE TAGS");
		for(Product p : products) {
			System.out.println(p.toString());
		}
		sc.close();
	}
}
