package lekcja;

import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Set<String>names = Set.of("Marek", "Maciej", "Krzysztof", "Maxa");
		for(String name: names) {
			System.out.println(name);
		}
		//names.add("kisiel");
		//zbiory tak utworzone s¹ niemodyfikowalne!
	}
}
