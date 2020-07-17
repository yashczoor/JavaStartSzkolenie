import java.util.Scanner;
import java.util.Random;

public class GuessGameWhile {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = new Random().nextInt(10);
		int userInput;
		System.out.println("Zgadnij liczbê miêdzy 1 a 10: ");
		
		
		while((userInput = input.nextInt()) != number){
			if(userInput > number) {
				System.out.println("Twoja liczba jest za du¿a Nina! Zgaduj dalej!");
			}else {
				System.out.println("Twoja liczba jest za ma³a Nina, zgaduj dalej!");
			}
		}
		
		input.close();
		System.out.println("Brawo kurwa!");
		
	}
}
