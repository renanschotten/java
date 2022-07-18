package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);
		//Predicate<Product> prodPred = p -> p.getValue() > 500.00;
		//list.removeIf(prodPred);
		list.removeIf(p -> p.getValue() > 500.00);

		for (Product p : list) {
			System.out.println(p.toString());
		}
	}

}
