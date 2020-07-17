package lekcja;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStreamsMethods {
	public static final int DIVIDER = 10;
	
	public static void main(String[] args) {
		Stream<Integer>numStream = Stream.iterate(0, x->x+1);
		
		List<Integer> squareNumbers = numStream.map(NumberStreamsMethods::square)
				.limit(100)
				.collect(Collectors.toList());
		
		Set<Integer>biggerThan5 = squareNumbers.stream()
				.filter(NumberStreamsMethods::isDividedBy)
				.map(NumberStreamsMethods::divide)
				.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println("List:");
		squareNumbers.forEach(x -> System.out.print(x + ";"));
		System.out.println("\nSet");
		biggerThan5.forEach(x->System.out.print(x+";"));
		
	}
	
	public static int square(int x) {
		return x*x;
	}
	
	public static boolean isDividedBy(int x) {
		return x%DIVIDER == 0;
	}
	
	public static int divide(int x) {
		return x/DIVIDER;
	}
}
