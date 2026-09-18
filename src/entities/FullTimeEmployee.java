package entities;

public class FullTimeEmployee extends Employee {
	
	
	
	public FullTimeEmployee(long id, String name, double baseSalary) {
		super(id, name, baseSalary);
	}

	@Override
	public double finalSalary() {
		return getBaseSalary() + (getBaseSalary() * 0.1);
	}

	@Override
	public String toString() {
		return "ID: " 
				+ getId()
				+ "\n"
				+ "Nome: "
				+ getName()
				+ "\n"
				+ "Tipo: FullTimeEmployee" 
				+ "\n"
				+ "Salario: "
				+ String.format("%.2f", finalSalary());
	}
}
