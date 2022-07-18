package app;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Vetores {
	public static void main(String[] args) {
		int b = longestConsecutive(new int[] { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 });
		System.out.println(b);
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * System.out.print("Numero de itens: "); int n = sc.nextInt(); double sum = 0;
		 * double[] vet = new double[n]; for (int i = 0; i < n; i++) {
		 * System.out.printf("Digite a altura %d: ", i + 1); vet[i] = sc.nextDouble(); }
		 * for (int i = 0; i < n; i++) { sum += vet[i]; }
		 * System.out.printf("Media: %.2f%n", sum / n);
		 * 
		 * sc.close();
		 */
	}

	public static int longestConsecutive(int[] nums) {

		int index = 1;
		Set<Integer> set = new TreeSet<Integer>();
		int longest = 0;
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		Object[] list = set.toArray();
		List<?> l = Arrays.asList(list);
		if (l.isEmpty())
			return 0;
		for (int i = 0; i < list.length - 1; i++) {
			if ((int) l.get(i + 1) - (int) l.get(i) == 1) {
				index++;
			} else {
				if(index > longest) {
					longest = index;
					index =1;
				}
			}
		}
		System.out.println(set);
		if (longest == 0) {
			longest = index;
		}
		return longest;
	}
}
