package zadanie;

import java.util.HashMap;

public class Company {
	private HashMap<String, Employee> employees;

	public Company() {
		setEmployees(new HashMap<>());
	}

	public HashMap<String, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(HashMap<String, Employee> employees) {
		this.employees = employees;
	}

	public Employee getEmployee(String firstName, String lastName) {
		String key = firstName + lastName;
		return employees.get(key);
	}

	public void addEmployee(Employee emp) {
		String key = emp.getFirstName()+emp.getLastName();
		employees.put(key, emp);
	}
}
