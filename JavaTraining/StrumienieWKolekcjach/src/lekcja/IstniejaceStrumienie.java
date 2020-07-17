package lekcja;

import java.util.Set;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IstniejaceStrumienie {
	private static final int DIVIDER = 10;
	
	public static void main(String[] args) {
		
		List<Integer>sqNums = IntStream.range(0,100)
				.map(IstniejaceStrumienie::square)
				.boxed()
				.collect(Collectors.toList());
		

		Set<Integer>biggerThan5 = sqNums.stream()
				.filter(IstniejaceStrumienie::isDividedBy)
				.map(IstniejaceStrumienie::divide)
				.collect(Collectors.toCollection(TreeSet<Integer>::new));
	
		System.out.println("List:");
		sqNums.forEach(x->System.out.print(x + ";"));
		System.out.println("\nSet:");
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
