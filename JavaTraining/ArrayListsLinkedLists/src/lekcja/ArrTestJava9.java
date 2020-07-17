package lekcja;

import java.util.List;

public class ArrTestJava9 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5,10,15);
		for(Integer n: numbers) {
			System.out.println(n);
		}
	}
}
