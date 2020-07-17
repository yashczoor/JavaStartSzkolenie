package lekcja;

import java.util.Map;
import java.util.Map.Entry;

public class MapEntryJava9 {
	public static void main(String[] args) {
		Map<String, Integer> people = Map.of("Jan", 12345, "Karol", 23456, "Zofia",34567);
		
		for(String n: people.keySet()) {
			System.out.println(n);
		}
		
		Map<String, Integer> people2 = Map.ofEntries(Map.entry("Jan", 12345),
				Map.entry("Karol", 23456),
				Map.entry("Zofia", 34567));

		for(Entry<String, Integer> n: people2.entrySet()) {
			System.out.println(n);
		}
	}
}
