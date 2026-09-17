package entities;

public abstract class Employee {
	
	private long id;
	private String name;
	private double baseSalary;
	
	public Employee(long id, String name, double baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public abstract double calculateSalary();
}
