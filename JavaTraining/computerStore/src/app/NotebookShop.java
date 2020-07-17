package app;

import data.Computer;
import logic.DataStore;

public class NotebookShop {

	public static void main(String[] args) {
		
		Computer c1 = new Computer("Apple", 12345);
		Computer c2 = new Computer("Apple", 12345);
		Computer c3 = new Computer("Acer", 345678);
		Computer c4 = new Computer("Acer", 111118);
		Computer c5 = new Computer("sadas", 23213);
		
		DataStore ds = new DataStore();
		
		ds.add(c1);
		ds.add(c2);
		ds.add(c3);
		ds.add(c4);
		ds.add(c5);
		
		Computer c6 = new Computer("sadas", 23213);
		
		System.out.println(ds.checkAvailability(c6));
		
		for(Computer c:ds.getComputers()) {
			System.out.println(c);
		}
		
	}

}
