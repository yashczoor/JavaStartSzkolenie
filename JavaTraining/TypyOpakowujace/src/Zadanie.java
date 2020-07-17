import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Zadanie {
	public static void main(String[] args) {
		String fileName = "liczby.txt";
		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());

			System.out.println("a + b + c =" + (a + b + c));

			BigInteger bigA = new BigInteger(br.readLine());
			BigInteger bigB = new BigInteger(br.readLine());

			System.out.println("BigA + BigB = " + bigA.add(bigB));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
