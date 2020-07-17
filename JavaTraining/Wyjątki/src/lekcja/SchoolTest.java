package lekcja;

public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(3);
		try {
			school.add(new Student(1, "Jan", "Kowalski"));
			school.add(new Student(2, "Nina", "Kobacka"));
			school.add(new Student(3, "Piotr", "Jaroszuk"));
			school.add(new Student(4, "Anna", "Wi�niewska"));
		} catch (NoMoreSpaceException e) {
			//System.err.println("Nie mo�na doda� tylu os�b");
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(school.find("Jan", "Kowalski"));
			System.out.println(school.find("Anna", "Wi�niewska"));
		} catch (NoElementFoundException e){
			//System.err.println("Masz b�ond");
			System.err.println(e.getMessage());
		}

	}
}
