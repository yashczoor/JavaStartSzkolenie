package lekcja;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionOperation {
	public static void main(String[] args) {
		String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
	List<String>words = Arrays.asList(sentence.split(" "));
	System.out.println("Oryginał: ");
	printCollection(words);
	Collections.shuffle(words);
	System.out.println("Shuffle: ");
	printCollection(words);
	
	//sortowanie
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	//Collections.sort(words);
	System.out.println("Sort: ");
	printCollection(words);
	
	int position = Collections.binarySearch(words, "tempor");
	System.out.println("Słowo \"tempor\" jest na " + position + " pozycji");
	int freq = Collections.frequency(words, "ut");
	System.out.println("Słowo \"ut\" występuje na liście " + freq + " razy");
	System.out.println("Najmniejszy element na liście to: " + Collections.min(words));
	}
	
	//wymieszanie słów
	
	private static void printCollection(Collection<String> words) {
		for(String s: words) {
			System.out.println(s + "; ");
		}
		System.out.println();
	}
}
