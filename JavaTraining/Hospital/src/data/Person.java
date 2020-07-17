package data;

public class Person {
	private String firstName;
	private String lastName;
	private int salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Person(String firstName, String lastName, int salary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSalary(salary);
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " "+ salary;
	}

}
