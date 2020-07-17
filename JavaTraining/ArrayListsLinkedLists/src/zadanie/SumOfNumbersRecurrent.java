package zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbersRecurrent {
	public static final String DONE = "exit";

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			List<Double> listNumbers = new ArrayList<Double>();

			readData(sc, listNumbers);
			printData(listNumbers);
		}

	}

	private static void readData(Scanner sc, List<Double> listNumbers) {
		System.out.println("Wpisz kolejn¹ liczbê lub \"exit\" by zakoñczyæ");
		String input = sc.nextLine();
		if (input.equals(DONE)) {
			return;
		} else {
			try {
				listNumbers.add(Double.parseDouble(input));
			} catch (NumberFormatException e) {
				System.out.println("Niepoprawny format liczby");
			}
		}
		readData(sc, listNumbers);
	}

	private static void printData(List<Double> listNumbers) {
		double result = 0;
		StringBuffer nums = new StringBuffer();
		for (Double l : listNumbers) {
			nums.append(l);
			nums.append("+");
			result += l;
		}
		nums.replace(nums.length() - 1, nums.length(), "=");
		nums.append(result);
		System.out.println(nums.toString());
	}
}
