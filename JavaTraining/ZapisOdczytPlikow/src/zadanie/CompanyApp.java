package zadanie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CompanyApp {
	public static final int EXIT = 0;
	public static final int READ_DATA = 1;
	public static final int WRITE_DATA = 2;
	public static final String fileName = "company.obj";

	public static void main(String[] args) throws InputMismatchException {

		Company cmp = new Company();
		int option = -1;
		Scanner sc = new Scanner(System.in);
		while (option != EXIT) {
			printOptions();
			try {
				option = sc.nextInt();
				sc.nextLine();
				switch (option) {
				case EXIT:
					break;
				case READ_DATA:
					readData(cmp);
					break;
				case WRITE_DATA:
					writeData(cmp, sc);
					break;
				default:
					throw new NoSuchElementException();
				}
			} catch (InputMismatchException e) {
				System.err.println("B³ond");
				sc.nextLine();
			} catch (NoSuchElementException e) {
				System.out.println("Brak takiej opcji");
			}
		}
		sc.close();

	}

	private static void writeData(Company cmp, Scanner sc) throws InputMismatchException {

		try (// Scanner sc = new Scanner(System.in);
				FileOutputStream fs = new FileOutputStream(fileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			for (int i = 0; i < cmp.getEmployees().length; i++) {
				System.out.println("Imiê: ");
				String firstName = sc.nextLine();
				System.out.println("Nazwisko: ");
				String lastName = sc.nextLine();
				System.out.println("Wyp³ata: ");
				double salary = sc.nextDouble();
				sc.nextLine();

				Employee tmp = new Employee(firstName, lastName, salary);
				cmp.add(tmp, i);

				// a tak w jednej linii
				// cmp.add(new Employee(firstName, lastName, salary), i);
			}
			os.writeObject(cmp);
			// sc.next();
		} catch (InputMismatchException e) {
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readData(Company cmp) {
		try (FileInputStream fs = new FileInputStream(fileName); ObjectInputStream os = new ObjectInputStream(fs);) {
			cmp = (Company) os.readObject();

			for (Employee tmp : cmp.getEmployees()) {
				System.out.println(tmp.toString());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void printOptions() {
		System.out.println("Opcje: ");
		System.out.println(EXIT + "- wyjœcie");
		System.out.println(READ_DATA + " - wczytaj pracowników");
		System.out.println(WRITE_DATA + " - zapisz pracowników");
	}
}
