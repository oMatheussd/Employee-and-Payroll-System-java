package entities;

public class Manager extends Employee{

	public Manager(long id, String name, double baseSalary) {
		super(id, name, baseSalary);
	}

	@Override
	public double finalSalary() {
		return getBaseSalary() + (getBaseSalary() * 0.2);
	}
	
	@Override
	public String toString() {
		return "ID: " 
				+ getId()
				+ "\n"
				+ "Nome: "
				+ getName()
				+ "\n"
				+ "Tipo: Manager" 
				+ "\n"
				+ "Salario: "
				+ String.format("%.2f", getBaseSalary());
	}
}
