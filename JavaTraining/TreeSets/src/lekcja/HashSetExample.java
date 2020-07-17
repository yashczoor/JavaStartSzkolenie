package lekcja;

import java.util.HashSet;

public class HashSetExample {
	//dodawanie, usuwanie i wyszukiwanie b. szybkie!
	//nieuporzadkowany i nieposortowany
	//musimy zdefiniowaæ hashCode 
	public static void main(String[] args) {
		HashSet<Person> people = new HashSet<>();
		
		people.add(new Person("Jan", "Kowalski"));
		people.add(new Person("Piotr", "Jaroszuk"));
		people.add(new Person("Jan", "Kowalski"));
		people.add(new Person("Ania", "Kawalec"));
		people.add(new Person("Ania", "Kawalec"));
		people.add(new Person("Szymon", "Zalewski"));
	
		System.out.println("PPL size: " + people.size());
		System.out.println("Contains Jan Kowalski?" + people.contains(new Person("Jan", "Kowalski"	)));
		people.remove(new Person("Ania", "Kawalec"));
		System.out.println("PPL size: " + people.size());
		//linkedHashSet daje pewnoœæ ¿e bêdziemy iterowaæ w tej samej kolejnoœci co dodawaliœmy
	}
}
