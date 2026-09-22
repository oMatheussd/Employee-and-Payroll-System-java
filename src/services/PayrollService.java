package services;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class PayrollService {
	
	List<Employee> employees = new ArrayList<>();
	
	public PayrollService() {
	}

	public List<Employee> getEmplooyes() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	public void getAllEmployees() {
		for (Employee e : employees) {
			System.out.println(e);
			System.out.println();
		}
	}
	
	public Employee findEmployeeById (long id) {
		System.out.println();
		for (Employee e : employees) {
			if (id == e.getId()) {
				return e;
			}
			System.out.println();
		}
		throw new PayrollException("O funcionario não existe!");
	}
	
	public double cauculatePayroll() {
		double payroll = 0;
		for (Employee p : employees) {
			payroll = payroll += p.finalSalary();
		}
		return payroll;
	}
	
	public void getPayroll() {
		for (Employee e : employees) {
			System.out.println(e.getName() + ": " + String.format("%.2f", e.finalSalary()));
		}
		System.out.println();
		System.out.println("TOTAL: " + String.format("%.2f", cauculatePayroll()));
	}
}
