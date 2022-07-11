package entities;

public class Individual extends TaxPayer {
	public final static double PERCENT_15 = 0.15;
	public final static double PERCENT_25 = 0.25;
	public final static double PERCENT_50 = 0.50;
	
	private Double healthExpanses;

	public Individual(String name, Double anualIncome) {
		super(name, anualIncome);
	}

	public Individual(String name, Double anualIncome, Double healthExpanses) {
		super(name, anualIncome);
		this.healthExpanses = healthExpanses;
	}

	public Double getHealthExpanses() {
		return healthExpanses;
	}

	public void setHealthExpanses(Double healthExpanses) {
		this.healthExpanses = healthExpanses;
	}

	@Override
	public double taxValue() {
		double anualIncome = super.getAnualIncome();
		if(anualIncome < 20000.00) {
			return (anualIncome * PERCENT_15) - (healthExpanses * PERCENT_50);
		}
		else {
			return (anualIncome * PERCENT_25) - (healthExpanses * PERCENT_50);
		}
	}

}
