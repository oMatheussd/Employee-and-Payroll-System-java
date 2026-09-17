package entities;

public class Manager extends Employee{

	public Manager(long id, String name, double baseSalary) {
		super(id, name, baseSalary);
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() + (getBaseSalary() * 0.2);
	}
}
