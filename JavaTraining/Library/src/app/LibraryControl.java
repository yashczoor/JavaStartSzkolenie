package app;

import utils.DataReader;
import utils.FileManager;
import utils.LibraryUtils;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import data.*;

public class LibraryControl {
	// zmienna do komunikacji
	private DataReader dataReader;
	private FileManager fileManager;

	// zmienna do przechowywania danych
	private Library library;

	public LibraryControl() {
		dataReader = new DataReader();
		// library = new Library();
		fileManager = new FileManager();
		try {
			library = fileManager.readLibraryFromFile();
			System.out.println("Wczytano dane biblioteki");
		} catch (ClassNotFoundException | IOException e) {
			library = new Library();
			System.out.println("Utworzono now� bibliotek�");
		}
	}

	// g��wna p�tla, wyb�r opcji

	public void controlLoop() {
		Option option = null;
		while (option != Option.EXIT) {
			try {
				printOptions();
				option = Option.createFromInt(dataReader.getInt());
				switch (option) {
				case ADD_BOOK:
					addBook();
					break;
				case ADD_MAGAZINE:
					addMagazine();
					break;
				case PRINT_BOOKS:
					printBooks();
					break;
				case PRINT_MAGAZINES:
					printMagazines();
					break;
				case ADD_USER:
					addUser();
					break;
				case PRINT_USERS:
					printUsers();
					break;
				case EXIT:
					exit();
				}
			} catch (InputMismatchException e) {
				System.out.println("Niepoprawne wprowadzenie, publikacji nie dodano");
			} catch (NumberFormatException | NoSuchElementException e) {
				System.out.println("Wybrana opcja nie istnieje, wybierz ponownie");
			}
		}
		dataReader.close();// zamykamy je�li by� otwarty strumie� wej�cia
	}

	private void printOptions() {
		System.out.println("Wybierz opcje: ");
		for (Option o : Option.values()) {
			System.out.println(o);
		}
	}

	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void printBooks() {
		LibraryUtils.printBooks(library);
	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	private void printMagazines() {
		LibraryUtils.printMagazines(library);
	}

	private void addUser() {
		LibraryUser user = dataReader.readAndCreateLibraryUser();
		library.addUser(user);
	}

	private void printUsers() {
		LibraryUtils.printUsers(library);
	}

	private void exit() {
		fileManager.writeLibraryToFile(library);
	}

	private enum Option {
		EXIT(0, "Wyjście z programu"), ADD_BOOK(1, "Dodanie ksiązki"), ADD_MAGAZINE(2, "Dodanie magazynu"),
		PRINT_BOOKS(3, "Wyświetlenie dostśpnych książek"), PRINT_MAGAZINES(4, "Wyświetlenie dostępnych magazynów"),
		ADD_USER(5, "Dodanie nowego użytkownika"), PRINT_USERS(6, "Wyświetlenie listy użytkowników");

		private int value;
		private String description;

		Option(int value, String description) {
			this.value = value;
			this.description = description;
		}

		@Override
		public String toString() {
			return value + "-" + description;
		}

		public static Option createFromInt(int option) throws NoSuchElementException {
			Option result = null;
			try {
				result = Option.values()[option];
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new NoSuchElementException("Brak elementu o wskazanym ID");
			}

			return result;
		}
	}

}
