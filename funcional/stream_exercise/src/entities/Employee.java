package entities;

public class Employee {
	private String name;
	private Double salary;
	private String email;

	public Employee(String name, String email, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}
}
