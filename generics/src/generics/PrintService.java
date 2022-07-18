package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		return list.get(0);
	}

	public void print() {
		if (list.isEmpty()) {
			System.out.println("[ ]");
		} else {
			System.out.print("[");
			System.out.print(list.get(0));
			for (int i = 1; i < list.size(); i++) {
				System.out.print(", " + list.get(i));
			}
			System.out.println("]");
		}
	}
}
