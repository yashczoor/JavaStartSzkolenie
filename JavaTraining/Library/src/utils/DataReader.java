package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.*;

public class DataReader {
	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}

	public int getInt() throws NumberFormatException {
		int number = 0;
		try {
			number = sc.nextInt();
		} catch (InputMismatchException e) {
			throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
		} finally {
			sc.nextLine();
		}
		return number;
	}

	public Book readAndCreateBook() {
		System.out.println("Tytu�: ");
		String title = sc.nextLine();
		System.out.println("Autora imi�: ");
		String authorName = sc.nextLine();
		System.out.println("Nazwisko autora: ");
		String authorSurname = sc.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = sc.nextLine();
		System.out.println("ISBN: ");
		String isbn = sc.nextLine();
		System.out.println("Rok wydania: ");
		int releaseDate = 0;
		int pages = 0;
		try {
			releaseDate = sc.nextInt();
			sc.nextLine();
			System.out.println("Ilo�� stron: ");
			pages = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}

		return new Book(title, authorName, authorSurname, releaseDate, pages, publisher, isbn);
	}

	public Magazine readAndCreateMagazine() {
		System.out.println("Tytu�: ");
		String title = sc.nextLine();
		System.out.println("Wydawnictwo: ");
		String publisher = sc.nextLine();
		System.out.println("J�zyk: ");
		String language = sc.nextLine();

		int year = 0;
		int month = 0;
		int day = 0;
		try {
			System.out.println("Rok wydania: ");
			year = sc.nextInt();
			sc.nextLine();
			System.out.println("Miesi�c: ");
			month = sc.nextInt();
			sc.nextLine();
			System.out.println("Dzie�: ");
			day = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}

		return new Magazine(title, publisher, language, year, month, day);
	}
	
	public LibraryUser readAndCreateLibraryUser() {
		System.out.println("Imię:");
		String firstName = sc.nextLine();
		System.out.println("Nazwisko:");
		String lastName = sc.nextLine();
		System.out.println("Pesel:");
		String pesel = sc.nextLine();
		
		return new LibraryUser(firstName, lastName, pesel);
	}
}
