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
		}
	}
	
	public Employee findEmployeeById (long id) {
		for (Employee e : employees) {
			if (id == e.getId()) {
				return e;
			}
		}
		throw new PayrollException("O funcionario não existe!");
	}
	//Caucular folha de pagamento
}
