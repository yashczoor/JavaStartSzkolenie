import java.util.Scanner;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class powiazanieZmiennych {
	public static void main(String[] args) {
		IntegerProperty first = new SimpleIntegerProperty();
		IntegerProperty second = new SimpleIntegerProperty();
		second.bind(first);
		
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Podaj pierwsz¹ liczbê");
			first.set(sc.nextInt());
			sc.nextLine();
			System.out.println("Druga zmienna " + second.get());
			
			System.out.println("Druga liczba: ");
			first.set(sc.nextInt());
			sc.nextLine();
			System.out.println("Zmiana w second: " + second.get());
			System.out.println("A first: " + first.get());
		}
	}
}
