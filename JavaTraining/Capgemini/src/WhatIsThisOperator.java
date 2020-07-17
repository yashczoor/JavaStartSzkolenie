import java.util.stream.Stream;

public class WhatIsThisOperator {
	public static void main(String[] args) {
		int x = 0;
		Stream<Number> y = 1;
		
		System.out.println(++x << 1);
		
		System.out.println(y.findFirst().get());
		
	}
}
