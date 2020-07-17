package zadanie;

import java.io.Serializable;

public class Company implements Serializable {
	private static final long serialVersionUID = 8434289640430988378L;
	public static final int EMPLOYEES = 3;
	public static int employeesNum = 0;
	private Employee[] employees;

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Company() {
		employees = new Employee[EMPLOYEES];
	}

	public void add(Employee emp, int index) {
		if (employeesNum < employees.length) {
			employees[index] = emp;
			employeesNum++;
		} else {
			System.out.println("Staff full");
		}
	}

}
