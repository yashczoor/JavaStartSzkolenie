import java.util.Scanner;

public class GatherAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		System.out.println("Podaj ile liczb chcesz zsumowaæ: ");
		int countNumbers = sc.nextInt();

		while (countNumbers-- > 0) {
			System.out.println("Podaj liczbê do zsumowania.Pozosta³o " + countNumbers);
			result += sc.nextInt();
			//countNumbers -= 1;
			//mogê odejmowaæ w warunku pêtli albo w pêtli
		}
		sc.close();
		System.out.println("Suma to: " + result);
	}
}