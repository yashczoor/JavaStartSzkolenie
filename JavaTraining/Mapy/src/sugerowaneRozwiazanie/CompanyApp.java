package sugerowaneRozwiazanie;

import java.util.Scanner;

public class CompanyApp {

	public static final int ADD = 0;
	public static final int FIND = 1;
	public static final int EXIT = 2;

	private Company company;

	CompanyApp() {
		company = new Company();
	}

	public static void main(String[] args) {
		CompanyApp companyApp = new CompanyApp();
		try (Scanner sc = new Scanner(System.in);) {

			int userOption;

			do {
				companyApp.printOptions();
				userOption = sc.nextInt();
				sc.nextLine();

				switch (userOption) {
				case CompanyApp.ADD:
					companyApp.addEmployee(sc);
					break;
				case CompanyApp.FIND:
					companyApp.findEmployee(sc);
					break;
				case CompanyApp.EXIT:
					break;
				}

			} while (userOption != CompanyApp.EXIT);
		}
	}

	private void printOptions() {
		System.out.println("0 - dodanie pracownika");
		System.out.println("1 - wyszukiwanie pracownika");
		System.out.println("2 - Wyjście z programu");
	}

	private void addEmployee(Scanner sc) {
		Employee emp = new Employee();

		System.out.println("Imię:");
		emp.setFirstName(sc.nextLine());
		System.out.println("Nazwisko:");
		emp.setLastName(sc.nextLine());
		System.out.println("Pensja: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();

		company.addEmployee(emp);
	}

	private void findEmployee(Scanner sc) {
		System.out.println("Imię:");
		String firstName = sc.nextLine();
		System.out.println("Nazwisko: ");
		String lastName = sc.nextLine();

		Employee employee = company.getEmployee(firstName, lastName);
		System.out.println(employee);
	}
}
