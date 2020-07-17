package app;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import data.operators;
import exceptions.UnknownOperatorException;

public class CalcTest {
	public static void main(String[] args) {

		double a;
		double b;
		operators operator = null;
		boolean noErrors = false;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		while (!noErrors) {
			try {
				System.out.println("Podaj 1 liczbê: ");
				a = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Wybierz dzia³anie: ");
				for (operators tmp : operators.values()) {
					System.out.println(tmp);
				}
				operator = operators.createFromChar(sc.nextLine());

				System.out.println("Podaj 2 liczbê: ");
				b = sc.nextDouble();
				sc.nextLine();

				System.out.println("Wynik dzia³ania " + a + " " + operator.toString() + " " + b + " = " + operator.calculate(a, b));
				
				noErrors = true;
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (UnknownOperatorException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Nieprawid³owe dane");
				sc.nextLine();
			} 
			if(!noErrors) {
				System.out.println("\nJeszcze raz!");
			}
		}
		sc.close();
	}
}
