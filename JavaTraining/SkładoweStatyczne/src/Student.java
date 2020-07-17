
public class Student {
	private static int studentsCount = 0;
	
	private String firstName;
	private String lastName;
	private String index;

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

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public Student() {
	}

	public Student(String firstName, String lastName, String index) {
		setFirstName(firstName);
		setLastName(lastName);
		setIndex(index);
		setStudentsCount(getStudentsCount() + 1);
	}

	public void printInfo() {
		System.out.println("Dane:");
		System.out.println("Imiê: " + firstName);
		System.out.println("Nazwikso: " + lastName);
		System.out.println("Numer indeksu: " + index);
	}

	public static int getStudentsCount() {
		return studentsCount;
	}

	public static void setStudentsCount(int studentsCount) {
		Student.studentsCount = studentsCount;
	}

}
