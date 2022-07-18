package app;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		System.out.println(sum);
	}

}
