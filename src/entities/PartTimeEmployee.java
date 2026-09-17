package entities;

public class PartTimeEmployee extends Employee{

	public PartTimeEmployee(long id, String name, double baseSalary) {
		super(id, name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return 0;
	}
}
