package zadanie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task {
	public static void main(String[] args) {
		List<String>names = Arrays.asList("Nina", "Piotr", "Marcin","Tomasz","Natalia");
		
		Collections.sort(names, String::compareToIgnoreCase);
		
		for(String name: names) {
			System.out.println(name);
		}
		
	}

	
}
