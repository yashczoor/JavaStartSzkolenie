import java.util.Scanner;

public class GatherAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		System.out.println("Podaj ile liczb chcesz zsumowa�: ");
		int countNumbers = sc.nextInt();

		while (countNumbers-- > 0) {
			System.out.println("Podaj liczb� do zsumowania.Pozosta�o " + countNumbers);
			result += sc.nextInt();
			//countNumbers -= 1;
			//mog� odejmowa� w warunku p�tli albo w p�tli
		}
		sc.close();
		System.out.println("Suma to: " + result);
	}
}