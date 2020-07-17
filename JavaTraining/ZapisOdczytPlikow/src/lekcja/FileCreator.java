package lekcja;

import java.io.File;
import java.io.IOException;

public class FileCreator {
	public static void main(String[] args) {
		String fileName = "testFile.txt";
		
		File file = new File(fileName);
		
		boolean fileExists = file.exists();
		if(!fileExists) {
			try {
				fileExists = file.createNewFile();
			} catch (IOException e){
				System.out.println("Nie udao siê");
			}
		}

		if(fileExists) {
			System.out.println("Plik " + fileName + " ju¿ istnieje");
		}
	}
}
