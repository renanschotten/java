package entities;

public class Product {
	private String name;
	private Double value;

	public Product(String name, Double value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String nonStaticUppercaseName() {
		return name.toUpperCase();
	}

	public static String staticUppercaseName(Product p) {
		return p.getName().toUpperCase();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + String.format("%.2f", value) + "]";
	}

}
