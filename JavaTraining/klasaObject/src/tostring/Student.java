package tostring;

public class Student {
	String firstName;
	String lastName;
	
	public Student(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
