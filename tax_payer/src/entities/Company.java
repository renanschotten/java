package entities;

public class Company extends TaxPayer {
	public final static double PERCENT_14 = 0.14;
	public final static double PERCENT_16 = 0.16;

	private Integer employeesNumber;

	public Company(String name, Double anualIncome) {
		super(name, anualIncome);
	}

	public Company(String name, Double anualIncome, Integer employeesNumber) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public double taxValue() {
		double anualIncome = super.getAnualIncome();
		if (employeesNumber > 10) {
			return anualIncome * PERCENT_14;
		} else {
			return anualIncome * PERCENT_16;
		}
	}

}
