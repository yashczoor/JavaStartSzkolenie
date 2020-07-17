package lekcja;

//import java.util.ArrayList;
import java.util.LinkedList;

public class Listy {
	public static void main(String[] args) throws InterruptedException {
		//ArrayList<Integer> ints = new ArrayList<>();
		LinkedList<Integer> ints = new LinkedList<>();
		
		for(int i = 0; i < 100; i++) {
			ints.add(i);
		}
		System.out.println("ints.get(50) = " + ints.get(50));
		System.out.println("Ile elementów: " + ints.size());
		System.out.println("Czyszczenie...");
		ints.clear();
		//Thread.sleep(1000);
		System.out.println("Na liœcie jest: " + ints.size() + " elementów");
	}
}
