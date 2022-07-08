package app;

import java.util.Locale;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Rectangle rect = new Rectangle();
		rect.width = 3.00;
		rect.height = 4.00;
		System.out.printf("AREA %.2f%n", rect.area());
		System.out.printf("PERIMETER %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL %.2f%n", rect.diagonal());
	}

}
