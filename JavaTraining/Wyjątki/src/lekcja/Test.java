package lekcja;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Podaj liczbê:");
		int number = 0;
		boolean error = true;
		while(error) {
			try {
				number = sc.nextInt();
				error = false;
			} catch(InputMismatchException ex) {
				System.out.println("Nie poda³eœ liczby ca³kowitej");
				sc.nextLine();
			}
		}
		System.out.println("Poda³eœ " + number);
		sc.close();
	}
}
