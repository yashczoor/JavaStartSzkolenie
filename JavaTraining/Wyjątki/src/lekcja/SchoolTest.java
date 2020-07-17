package lekcja;

public class SchoolTest {
	public static void main(String[] args) {
		School school = new School(3);
		try {
			school.add(new Student(1, "Jan", "Kowalski"));
			school.add(new Student(2, "Nina", "Kobacka"));
			school.add(new Student(3, "Piotr", "Jaroszuk"));
			school.add(new Student(4, "Anna", "Wiœniewska"));
		} catch (NoMoreSpaceException e) {
			//System.err.println("Nie mo¿na dodaæ tylu osób");
			System.err.println(e.getMessage());
		}
		
		try {
			System.out.println(school.find("Jan", "Kowalski"));
			System.out.println(school.find("Anna", "Wiœniewska"));
		} catch (NoElementFoundException e){
			//System.err.println("Masz b³ond");
			System.err.println(e.getMessage());
		}

	}
}
