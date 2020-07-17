package lekcja;

import java.util.Arrays;
import java.util.List;

public class ArrTest {
	public static void main(String[] args) {
		Integer[] ints = {5,10,15};
		List<Integer> list = Arrays.asList(ints);
		for (Integer i: list) {
			System.out.println(i);
		}
	}
}
