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

	public boolean nonStaticProductPredicate() {
		return value >= 500.00;
	}

	public static boolean staticProductPredicate(Product p) {
		return p.getValue() >= 500.00;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + value + "]";
	}

}
