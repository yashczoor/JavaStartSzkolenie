package lekcja;
import java.util.Scanner;

public class ZlapJeWszystkie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 1233;
		
		System.out.println("Podaj liczbê: ");
		
		try {
			number = sc.nextInt();
//Exception to klasa ponad b³êdami, wiêc tak wy³apie wszystkie 
		} catch(Exception ex) {
			System.out.println("Coœ posz³o nie tak");
			ex.printStackTrace();
			sc.nextLine();
		}
		System.out.println(number);
		sc.close();
	}
	
}
