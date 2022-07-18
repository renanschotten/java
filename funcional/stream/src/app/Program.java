package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		List<Integer> lInt = Arrays.asList(3, 2, 5, 9, 4, 5);
		Stream<Integer> sInt = lInt.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(sInt.toArray()));
		Stream<String> sStr = Stream.of("Maria", "Alex", "Joao");
		System.out.println(Arrays.toString(sStr.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

	}

}
