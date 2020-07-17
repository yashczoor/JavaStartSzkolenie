import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);//pozwala na wpisywanie kropki zamiast przecinka
		//jako separator dziesiêtny
		//java zaci¹ga te ustawienia z ustawien lokalnych systemu op.
		

		System.out.println("A: ");
		double a = input.nextDouble();
		System.out.println("B: ");
		double b = input.nextDouble();

		input.close();
		System.out.println("A + B = " + (a + b));
	}
}
