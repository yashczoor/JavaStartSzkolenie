package tutorial;

public class User {
	private String firstName;
	private String lastName;
	
	public String getFirstName(){
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
	
	public User(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
}
