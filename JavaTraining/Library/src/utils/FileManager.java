package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Library;

public class FileManager {
	public static final String FILE_NAME = "Library.o";

	public void writeLibraryToFile(Library lib) {
		try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			os.writeObject(lib);

		} catch (FileNotFoundException e) {
			System.err.println("Brak pliku " + FILE_NAME);
		} catch (IOException e) {
			System.err.println("B³¹d zapisu do " + FILE_NAME);
		}
	}

	public Library readLibraryFromFile() throws IOException, ClassNotFoundException {
		Library library = null;
		try(
				FileInputStream fs = new FileInputStream(FILE_NAME);
				ObjectInputStream os = new ObjectInputStream(fs);
				) {
			library = (Library)os.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("Brak pliku " + FILE_NAME);
			throw e;
		} catch (IOException e) {
			System.err.println("B³¹d odczytu z " + FILE_NAME);
			throw e;
		} catch (ClassNotFoundException e) {
			System.err.println("Nieprawid³owy format pliku");
			throw e;
		}
		
		return library;
	}

}

