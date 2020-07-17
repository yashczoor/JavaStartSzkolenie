package lekcja;

public class School {
	private Student[] students;
	private int studentsNumber;

	public School(int studentsNumber) {
		students = new Student[studentsNumber];
		this.studentsNumber = 0;
	}

	public void add(Student s) throws NoMoreSpaceException {
		if (studentsNumber >= students.length) {
			throw new NoMoreSpaceException("Brak³o miejsca");
		} else {
			students[studentsNumber] = s;
			studentsNumber++;
		}
	}
	
	public Student find(String firstName, String lastName) throws NoElementFoundException{
		boolean found = false;
		Student foundElement = null;
		int index = 0;
		while(!found && index < students.length) {
			if(students[index].getFirstName().equals(firstName)
					&&students[index].getLastName().equals(lastName)) {
				foundElement = students[index];
				found = true;
			} else {
				index++;
			}
		}
		
		if(foundElement == null) {
			throw new NoElementFoundException("Brak studenta " + firstName + " " + lastName);
		}
		
		return foundElement;
	}
}
