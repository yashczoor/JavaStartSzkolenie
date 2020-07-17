import java.util.Scanner;
//import java.util.Locale;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//do zmiennej word zostanie przypisany znak entera (nowej linii)
		sc.nextLine(); //zeby uniknac "zjedzenia" entera przez scanner dla zmiennej word
				
		String word = sc.nextLine();
		
		System.out.println(number);
		System.out.println(word);
		
		sc.close();
		
		
	}
	
}
