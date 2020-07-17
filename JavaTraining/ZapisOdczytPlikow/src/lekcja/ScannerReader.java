package lekcja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "testFile.txt";
		File file = new File(fileName);
		Scanner sc = new Scanner(file);

		int lines = 0;
		while (sc.hasNextLine()) {
			String name = sc.nextLine();
			System.out.println(name);
			lines++;
		}
		System.out.println("W pliku jest " + lines + " wierszy.");
		sc.close();
	}

}
