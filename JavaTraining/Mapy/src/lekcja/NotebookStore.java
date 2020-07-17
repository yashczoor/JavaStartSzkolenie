package lekcja;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NotebookStore {
	public static void main(String[] args) {
		Map<String, Notebook> notebooks = new HashMap<>();
		//Map<String, Notebook> notebooks2 = new LinkedHashMap<>();
		//linkedhashmap zachowuje kolejnosc dodawanych elementow
		//Map<String, Notebook> notebooks = new TreeMap<>();
		//treemap porzadkuje zbior zgodnie z naturalnym porzadkiem lub komparatorem
		notebooks.put("B590", new Notebook("Lenovo", "B590"));
		notebooks.put("Inspiron", new Notebook("Dell", "Inspiron0211A"));
		notebooks.put("G2A33EA",new Notebook("HP", "G2A33EA"));
		notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));
		
		//zbior kluczy
		System.out.println("Modele laptopów:");
		for(String key: notebooks.keySet()) {
			System.out.println(key);
		}
		
		//info a laptopach na podst kluczy
		String key = "G2A33EA";
		System.out.println("Laptop o kodzie:");
		System.out.println(notebooks.get(key));
		
		//usuwamy na podstawie klucza
		notebooks.remove("XPS0091V");
		
		System.out.println("Na stanie laptopów: " + notebooks.size());
		
	}
	
}
