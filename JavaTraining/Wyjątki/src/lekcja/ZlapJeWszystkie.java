package lekcja;
import java.util.Scanner;

public class ZlapJeWszystkie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 1233;
		
		System.out.println("Podaj liczb�: ");
		
		try {
			number = sc.nextInt();
//Exception to klasa ponad b��dami, wi�c tak wy�apie wszystkie 
		} catch(Exception ex) {
			System.out.println("Co� posz�o nie tak");
			ex.printStackTrace();
			sc.nextLine();
		}
		System.out.println(number);
		sc.close();
	}
	
}
