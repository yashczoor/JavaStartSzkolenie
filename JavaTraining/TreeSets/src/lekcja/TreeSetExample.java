package lekcja;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(1);
		//tylko unikatowe wartoœci. Dwa razy sie nie doda
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(4);
		System.out.println("Size: " + set.size());
		System.out.println("First: "+set.first());
		System.out.println("Last:" + set.last());
		//uporzadkowany z automatu
		System.out.println("Contains 2?" + set.contains(2));
		
	}
}
