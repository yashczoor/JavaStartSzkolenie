package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Totolotek {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		List<Integer> userNumbers = new ArrayList<>();
		lotto.randomize();

		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 1; i <= 6; i++) {
				System.out.println("Podaj " + i + " liczbę z zakresu od 1 do 49");
				userNumbers.add(sc.nextInt());
				sc.nextLine();
			}
		}
		System.out.println("Trafiłeś " + lotto.checkResult(userNumbers) + " liczb!");

	}

}
