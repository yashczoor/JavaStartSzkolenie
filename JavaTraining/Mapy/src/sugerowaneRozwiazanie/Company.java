package sugerowaneRozwiazanie;

import java.util.HashMap;

public class Company {
	private HashMap<String, Employee> employees;
	
	public Company() {
		employees = new HashMap<>();
	}
	
	public boolean addEmployee(Employee emp) {
		String key = emp.getFirstName() + " " + emp.getLastName();
		
		if(employees.get(key)!=null) {
			return false;
		} else {
			employees.put(key, emp);
			return true;
		}
	}
	
	public Employee getEmployee(String firstName, String lastName) {
		String key = firstName + " " + lastName;
		return employees.get(key);
	}
}
