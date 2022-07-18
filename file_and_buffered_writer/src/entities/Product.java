package entities;

public class Product {
	private String name;
	private Double value;
	private Integer qtd;

	public Product(String name, Double value, Integer qtd) {
		super();
		this.name = name;
		this.value = value;
		this.qtd = qtd;
	}

	public double totalValue() {
		return value * qtd;
	}
	
	public String toString() {
		return name + ", " + String.format("%.2f",totalValue());
	}
}
