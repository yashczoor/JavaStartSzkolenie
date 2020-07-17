package lekcja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[2];
		boolean error = true;
		
		while(error) {
			try {
				System.out.println("Podaj 1 liczb�: ");
				numbers[0] = sc.nextInt();
				sc.nextLine();
				System.out.println("Podaj 2 liczb�: ");
				numbers[1] = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Kt�r� warto�� wy�wietli�? 1 czy 2?");
				System.out.println(numbers[sc.nextInt() - 1]);
				error = false;
			} catch(InputMismatchException ex) {
				System.out.println("Nie poda�e� liczby ca�kowitej");
			} catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Wybierz 1 lub 2");
			} finally {
				sc.nextLine();
			}
		}
		sc.close();
	}
}
