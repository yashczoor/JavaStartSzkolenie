package lessonTask;

import java.util.Scanner;

public class AppendLastFive {
	private static final int MAX_STRINGS = 5;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringBuilder appendLastChars = new StringBuilder();

		System.out.println("Wprowadz piêæ s³ów: ");

		for (int i = 1; i <= MAX_STRINGS; i++) {
			System.out.println("S³owo nr." + i + ":");
			String word = input.nextLine();
			if (word.length() != 0) {
				appendLastChars.append(word.charAt(word.length() - 1));
			}
		}
		input.close();
		System.out.println("\nOstatnie litery s³ów to: ");
		System.out.println(appendLastChars.toString());

	}

}
