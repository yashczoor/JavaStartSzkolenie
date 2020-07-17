package Zadanie;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IteratorZadanie {
	public static void main(String[] args) {
		Map<String, String> strPeople = new TreeMap<>();
		
		strPeople.put("Smoczyński", "Marcin Smoczyński - 27");
		strPeople.put("Jaroszuk", "Piotr Jaroszuk - 27");
		strPeople.put("Paluszkiewicz", "Marcin Paluszkiewicz - 27");
		strPeople.put("Gryzio", "Tomasz Gryzio - 34");
		strPeople.put("Joachimowicz", "Milena Joachimowicz - 25");
		
		Iterator<String> strIterator = strPeople.values().iterator();
		while(strIterator.hasNext()) {
			System.out.println(strIterator.next());
		}
	
	}
}
