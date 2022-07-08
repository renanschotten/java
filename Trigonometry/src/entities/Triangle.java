package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	public double area;

	private double calculateArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public double getArea() {
		return calculateArea();
	};
}
