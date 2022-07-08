import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
	}

	public static int max(int x, int y) {
		return (x > y) ? x : y;

		/*
		 * String product1 = "Computer"; String product2 = "Office desk"; int age = 30;
		 * int code = 5290; char gender = 'F'; double price1 = 2100.0; double price2 =
		 * 650.50; double measure = 53.234567;
		 * 
		 * System.out.println("Products:");
		 * System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		 * System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		 * System.out.println();
		 * System.out.printf("Record: %d years old, code %d and gender %s%n", age, code,
		 * gender); System.out.println();
		 * System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		 * System.out.printf("Rounded with three decimal places: %.3f%n", measure);
		 * Locale.setDefault(Locale.US); System.out.printf("US decimal point: %.3f%n",
		 * measure);
		 */

		/*
		 * Locale.setDefault(Locale.US); String texto = "Ola, mundo";
		 * System.out.println(texto); System.out.println("Bom dia"); double x =
		 * 10.7578651; System.out.println(x); System.out.printf("%.2f%n", x);
		 * System.out.printf("%.4f%n", x);
		 * 
		 * System.out.println("Valor: " + x); System.out.printf("Total %.2f", x);
		 */
	}

}
