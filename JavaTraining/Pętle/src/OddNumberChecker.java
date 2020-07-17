import java.util.Scanner;

public class OddNumberChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int tmp;
		for (int i = 0; i < 3; i++) {
			System.out.println("Podaj liczbê: ");
			tmp = input.nextInt();
		
			if (tmp % 2 == 0) {
				System.out.println("Licza " + tmp + " parzyst¹ jest.");
			} else {
				System.out.println("Liczba " + tmp + " nie jest parzysta!");
			}
		}
		input.close();
	}
}
