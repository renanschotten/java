package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Product;
import util.UppercaseName;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::staticUppercaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::nonStaticUppercaseName).collect(Collectors.toList());
		//Function<Product, String> func = (p) -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		List<String> names = list.stream().map((p) -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
	}

}
