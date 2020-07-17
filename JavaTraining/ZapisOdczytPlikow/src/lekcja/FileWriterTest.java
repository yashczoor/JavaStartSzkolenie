package lekcja;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		String fileName = "testFile.txt";
		try(
				FileWriter fileWriter = new FileWriter(fileName);//tak nadpisze
				//FileWriter fileWriter = new FileWriter(fileName, true);//tak dopisze
				BufferedWriter writer = new BufferedWriter(fileWriter);
				){
			//writer.newLine();
			writer.write("Bolek");
			writer.newLine();
			writer.write("Lolek");
			writer.newLine();
			writer.write("Karolak");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
