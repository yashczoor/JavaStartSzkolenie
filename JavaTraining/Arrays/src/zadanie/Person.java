package zadanie;

public class Person {
	private String firstName;
	private String lastName;
	private String pesel;

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

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public Person(String firstName, String lastName, String pesel) {
		setFirstName(firstName);
		setLastName(lastName);
		setPesel(pesel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;

		if (getFirstName() == null) {
			if (p.getFirstName() != null)
				return false;
		} else if (!getFirstName().equals(p.getFirstName()))
			return false;
		if (getLastName() == null) {
			if (p.getLastName() != null)
				return false;
		} else if (!getLastName().equals(p.getLastName())) {
			return false;
		}

		if (getPesel() == null) {
			if (p.getPesel() != null)
				return false;
		} else if (!getPesel().equals(p.getPesel())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + pesel;
	}
}