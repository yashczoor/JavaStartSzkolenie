package lekcja;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsCurrent {
	public static void main(String[] args) {
		Stream<String>strings = Stream.of("a","bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		
		@SuppressWarnings("unused")
		List<String>stringList = strings.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
		
	}
}
