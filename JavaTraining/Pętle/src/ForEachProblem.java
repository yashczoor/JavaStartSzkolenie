import java.util.Scanner;

public class ForEachProblem {
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int tmp: arr) {
			System.out.println("Podaj liczbê ca³kowit¹: ");
			tmp = sc.nextInt();
		}
		//wartosci s¹ przypisywane do zmiennej tmp a nie do elementów tablicy
		//w powy¿szym przyk³adzie
		//dlatego w wyniku mamy trzy zera!
	
		for(int tmp: arr) {
			System.out.println(tmp);
		}
		
		sc.close();
	}
	
}
