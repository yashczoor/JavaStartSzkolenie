import java.util.Scanner;

public class University {
	public static final int EXIT = 0;
	public static final int ADD = 1;
	public static final int PRINT_STUDENTS = 2;

	public static void main(String[] args) {
		int option = -1;
		Student[] students = new Student[10];
		Scanner sc = new Scanner(System.in);

		while (option != EXIT) {
			System.out.println();
			System.out.println("Wybierz opcjê: ");
			System.out.println("0 - wyjdz");
			System.out.println("1 - dodaj studenta");
			System.out.println("2 - poka¿ studentów");
			option = sc.nextInt();

			switch (option) {
			case EXIT:
				System.out.println("papa");
				break;
			case ADD:
				sc.nextLine();
				System.out.println("Imiê: ");
				String firstName = sc.nextLine();
				System.out.println("Nazwisko: ");
				String lastName = sc.nextLine();
				System.out.println("Index: ");
				String index = sc.nextLine();

				students[Student.getStudentsCount()] = new Student(firstName, lastName, index);
				break;
			case PRINT_STUDENTS:
				for (int i = 0; i < Student.getStudentsCount(); i++) {
					students[i].printInfo();
				}
				break;
			default:
				System.out.println("nie ma takiej opcji!");
			}
		}
		sc.close();
	}
}
// dodaj studenta
// wydrukuj studentów
// wyjdz
