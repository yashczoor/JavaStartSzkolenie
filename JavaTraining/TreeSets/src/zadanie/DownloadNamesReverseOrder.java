package zadanie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class DownloadNamesReverseOrder {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileName = "namespl.txt";

		TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return -(s1.compareTo(s2));
			}
		});

		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
			String name;
			while ((name = br.readLine()) != null) {
				names.add(name);
				//names.add(br.readLine()); <-- w ten sposob przechodzi już do kolejnej linii
				//czyli nie dziala prawidlowo!
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Imion jest:" + names.size());
		System.out.println("Pierwsze: " + names.first());
		System.out.println("Ostatnie: " + names.last());
	
	}
}
