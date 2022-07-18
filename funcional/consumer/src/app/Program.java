package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import entities.Product;
import util.ProductConsumer;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// list.forEach(new ProductConsumer());
		// list.forEach(Product::staticProductConsumer);
		// list.forEach(Product::nonStaticProductConsumer);
		// Consumer<Product> cons = p -> p.setValue(p.getValue() * 1.1);
		// list.forEach(cons);
		list.forEach(p -> p.setValue(p.getValue() * 1.1));
		list.forEach(System.out::println);
	}

}
