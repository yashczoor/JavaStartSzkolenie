public class Employee {
	//pola
	private String firstName;
	private String lastName;
	private double salary;
	
	//gettery i settery
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//konstruktor
	public Employee(String firstName, String lastName, double salary) {
		setFirstName(firstName);
		setLastName(lastName);
		setSalary(salary);
	}
}
