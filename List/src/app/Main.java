package app;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Ana");
		list.add("Carlos");
		list.add("Jose");
		list.add("Muriel");
			
		for(String str : list) {
			System.out.println(str);
		}
		
		list.add(2, "Andre");
		list.remove("Jose");
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("------------------");
		for(String str : list) {
			System.out.println(str);
		}
	}

}
