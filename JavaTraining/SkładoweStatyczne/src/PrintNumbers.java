import java.util.Scanner;

public class PrintNumbers {

	public static final int EXIT = 0;
	
	public static void printNumbers(int start, int end) {
		for(int i = start;i <=end;i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start, end;
		do {
			System.out.println("Pierwsza liczba: ");
			start = sc.nextInt();
			System.out.println("Druga liczba: ");
			end = sc.nextInt();
			printNumbers(start, end);
			
			System.out.println("Koniec - 0");
			System.out.println("JEszcze raz! - 1");
			
		} while (sc.nextInt() != EXIT);
			
		sc.close();
	}
}
