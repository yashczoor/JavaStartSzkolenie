package lekcja;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesJava9 {
	public static void main(String[] args) throws IOException{
		String fileName = "testFile.txt";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fileReader);
		
		try(	fileReader;
				reader;
				){
			String nextLine =null;
			int lines = 0;
			while((nextLine=reader.readLine())!=null) {
				System.out.println(nextLine);
				lines++;
			}
			System.out.println("Wierszy: " + lines);
		}
		
	}
}
