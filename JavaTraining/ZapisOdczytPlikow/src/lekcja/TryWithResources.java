package lekcja;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		String fileName = "testFile.txt";

		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader reader = new BufferedReader(fileReader);) {
			//BufferedReader reader = new BufferedReader(new FileReader("testFile.txt"));
			
			String nextLine = null;
			int lines = 0;
			while ((nextLine = reader.readLine()) != null) {
				System.out.println(nextLine);
				lines++;
			}
			System.out.println(lines + " wierszy");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
