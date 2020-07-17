package lekcja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveException {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Kasia");
		names.add("Basia");
		names.add("Kajtek");
		names.add("Wojtek");
		names.add("Maniek");

		// ok, bo bez iteratora
		System.out.println("Pętla numer 1");
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
			if (name.equals("Basia")) {
				names.remove(name);
				i--;
			}
		}
		System.out.println();
		Iterator<String> namesIterator = names.iterator();
		
		System.out.println("Pętla numer 2 bez błędu");
		while (namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
			if (name.equals("Kasia")) {
				// błąd - iterujemy po kolekcji za pomocą iteratora, a usuwamy
				// obiekt metodą remove() bezpośrednio z kolekcji
				namesIterator.remove();
			}
		}
		System.out.println();
		
		/*System.out.println("Pętla numer 2 z błędem");
		while (namesIterator.hasNext()) {
			String name = namesIterator.next();
			System.out.println(name);
			if (name.equals("Wojtek")) {
				// błąd - iterujemy po kolekcji za pomocą iteratora, a usuwamy
				// obiekt metodą remove() bezpośrednio z kolekcji
				names.remove(name);
			}
		}
		System.out.println();*/

		System.out.println("Pętla numer 3");
		for (String name : names) {
			System.out.println(name);
			if (name.equals("Maniek")) {
				// błąd - iterujemy po kolekcji za pomocą niejawnego iteratora
				// petli for-each, a usuwamy
				// obiekt metodą remove() bezpośrednio z kolekcji
				names.remove(name);
			}
		}

	}

}
