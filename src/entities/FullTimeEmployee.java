package entities;

public class FullTimeEmployee extends Employee {
	
	
	
	public FullTimeEmployee(long id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
		super(id, name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() + (getBaseSalary() * 0.1);
	}
}
