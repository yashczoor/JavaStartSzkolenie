package lekcja;

import java.util.Arrays;
import java.util.function.Consumer;

public class Lekcja {
	//consumeList(persons, p->System.out.println(p));
	//consumeList(persons, System.out::println);
	//powyżej toto samo. Zapisy są równoznaczne
	
	//generate(persons,10,() -> new Person());
	//generate(persons,10,Person::new);
	//te też
	public static void main(String[] args) {
		String[] names = {"Kowalski", "Kobacki", "Wojnarek", "Bednarek", "Krzywousty"};
		Arrays.sort(names, Lekcja::sortAscending);
		consumeArray(names, System.out::println);
		
		System.out.println(">>>");
		Arrays.sort(names, Lekcja::sortDescending);
		consumeArray(names, System.out::println);
	}
	
	private static <T> void consumeArray(T[] arr, Consumer<T>consumer) {
		for(T t:arr) {
			consumer.accept(t);
		}
	}
	
	private static int sortAscending(String s1, String s2) {
		return s1.compareTo(s2);
	}

	private static int sortDescending(String s1, String s2) {
		return s2.compareTo(s1);
	}
}
