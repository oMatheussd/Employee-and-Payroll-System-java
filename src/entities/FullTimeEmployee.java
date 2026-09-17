package entities;

public class FullTimeEmployee extends Employee {
	
	private int hoursWorked;
	private double hourlyRate;
	
	public FullTimeEmployee(long id, String name, double baseSalary, int hoursWorked, double hourlyRate) {
		super(id, name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return 0;
	}
}
