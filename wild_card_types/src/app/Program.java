package app;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> itgs = Arrays.asList(5, 2, 10);
		printList(itgs);
		
		List<String> strs = Arrays.asList("abc", "def", "fof");
		printList(strs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
