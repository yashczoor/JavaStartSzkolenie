package zadanie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

	public static final int EXIT = 0;
	public static final int ADD = 1;
	public static final int GET = 2;

	public static void main(String[] args) {
		Company comp;
		// przesun try do srodka petli jeleniu!

		int option = -1;
		Scanner sc = new Scanner(System.in);
		comp = new Company();
		
		while (option != EXIT) {
			printOptions();
			try {
				option = sc.nextInt();
				sc.nextLine();

				switch (option) {
				case EXIT:
					break;
				case ADD:
					addEmployee(sc, comp);
					break;
				case GET:
					getEmployee(sc, comp);
					break;
				default:
					System.out.println("Brak takiej opcji!");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("niepoprawny format danych");
				sc.next();
			}

			
		}
		sc.close();
	
	}

	public static void printOptions() {
		System.out.println("0 - wyjście");
		System.out.println("1 - dodanie pracownika");
		System.out.println("2 - info o pracowniku");
	}
	
	public static void addEmployee(Scanner sc, Company comp) {
		
		System.out.println("Imię: ");
		String firstName = sc.nextLine();
		System.out.println("Nazwisko:");
		String lastName = sc.nextLine();
		System.out.println("Pensja:");
		double salary = sc.nextDouble();
		sc.nextLine();
		comp.addEmployee(new Employee(firstName, lastName, salary));
	}
	
	public static void getEmployee(Scanner sc, Company comp) {
		System.out.println("Imię: ");
		String firstName = sc.nextLine();
		System.out.println("Nazwisko:");
		String lastName = sc.nextLine();
		System.out.println(comp.getEmployee(firstName, lastName));
	}
}
