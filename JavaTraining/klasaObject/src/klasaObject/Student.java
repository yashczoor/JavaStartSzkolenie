package klasaObject;

public class Student {
	String firstName;
	String lastName;

	public Student(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	@Override
	public boolean equals(Object obj) {
		// najpierw sprawdzam czy s¹ równe fizycznie (to samo miejsce w pamiêci)
		if (this == obj)
			return true;
		// czy przekazany obiekt na pewno nie jest pusty
		if (obj == null)
			return false;

		// czy argument jest tego samego typu
		if (!(obj instanceof Student))
			return false;
		// rzutowanie na odpowiedni typ
		Student s = (Student) obj;

		if (this.firstName == s.firstName && this.lastName == s.lastName)
			return true;
		if (this.firstName != null) {
			if (!this.firstName.equals(s.firstName))
				return false;
		} else if (this.firstName == null && s.firstName != null)
			return false;
		if (this.lastName != null) {
			if (!this.lastName.equals(s.lastName))
				return false;
		} else if (this.lastName == null && s.lastName != null)
			return false;

		return true;
	}
}
