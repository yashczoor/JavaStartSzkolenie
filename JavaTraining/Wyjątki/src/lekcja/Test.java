package lekcja;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Podaj liczb�:");
		int number = 0;
		boolean error = true;
		while(error) {
			try {
				number = sc.nextInt();
				error = false;
			} catch(InputMismatchException ex) {
				System.out.println("Nie poda�e� liczby ca�kowitej");
				sc.nextLine();
			}
		}
		System.out.println("Poda�e� " + number);
		sc.close();
	}
}
