package entities;

public class Product {
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Product(String name, double value) {
		this.name = name;
		this.value = value;
	}

	private String name;
	private double value;

}
