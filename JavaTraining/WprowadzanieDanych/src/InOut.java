import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		Scanner inputBox = new Scanner(System.in);

		String firstName;
		String lastName;
		int age;

		System.out.println("Wprowadz swoje imiê: ");
		firstName = inputBox.nextLine();
		System.out.println("Wprowadz swoje nazwisko: ");
		lastName = inputBox.nextLine();
		System.out.println("Wiek: ");
		age = inputBox.nextInt();

		inputBox.close();

		System.out.println("Czeœæ " + firstName + " " + lastName);
		System.out.println("Masz ju¿ " + age + " lat. Jesteœ piêknym cz³owiekiem!");
	}
}
