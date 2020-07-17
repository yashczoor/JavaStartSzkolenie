package app;

import data.Pizza;
import java.util.Scanner;

public class Pizzeria {
	public static void main(String[] args) {
		
		System.out.println("Lista pizz:");
		for(Pizza tmp: Pizza.values()) {
			System.out.println(tmp.name());
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Jak¹ pizze chcesz zamówiæ?");
		Pizza zamowienie = Pizza.valueOf(input.nextLine());
		
		System.out.println("Zamówi³eœ pizzê " + zamowienie);
		input.close();
	}
	
}
