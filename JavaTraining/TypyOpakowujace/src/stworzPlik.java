import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class stworzPlik {

	public static void main(String[] args) {
		String fileName = "liczby.txt";
		try (FileWriter fw = new FileWriter(fileName); BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write("123");
			bw.newLine();
			bw.write("1234");
			bw.newLine();
			bw.write("12345");
			bw.newLine();
			bw.write("123456789123456789");
			bw.newLine();
			bw.write("987654321987654321");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}