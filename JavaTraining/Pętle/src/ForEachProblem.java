import java.util.Scanner;

public class ForEachProblem {
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int tmp: arr) {
			System.out.println("Podaj liczb� ca�kowit�: ");
			tmp = sc.nextInt();
		}
		//wartosci s� przypisywane do zmiennej tmp a nie do element�w tablicy
		//w powy�szym przyk�adzie
		//dlatego w wyniku mamy trzy zera!
	
		for(int tmp: arr) {
			System.out.println(tmp);
		}
		
		sc.close();
	}
	
}
