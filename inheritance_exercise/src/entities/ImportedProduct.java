package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct(String name, Double price) {
		super(name, price);
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		Double sum = super.getPrice() + customsFee;
		return sum.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(" $ " + priceTag());
		sb.append(" (Customs fee: $ " + customsFee);
		sb.append(")");
		return sb.toString();	
	}
}
