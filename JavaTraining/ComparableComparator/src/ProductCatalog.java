import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ProductCatalog {
	public static void main(String[] args) {
		Product[] products = new Product[7];
		products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
		products[1] = new Product("Amino", "Zupa ogórkowa", "Zupy");
		products[2] = new Product("WINIARY", "Zupa pomidorowa", "Zupy");
		products[3] = new Product("WINIARY", "Zupa pomidorowa", "Zupy b³yskawiczne");
		products[4] = new Product("WINIARY", "Rosó³", "Zupy");
		products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
		products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");

		System.out.println("Nieposortowana: ");
		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println();
		// asc
		Arrays.sort(products);
		System.out.println("Posortowana: ");
		for (Product p : products) {
			System.out.println(p);
		}
		System.out.println();
		// desc
		Arrays.sort(products, Collections.reverseOrder());
		System.out.println("Odwrotnie: ");
		for (Product p : products) {
			System.out.println(p);
		}
		// asc comparator
		System.out.println();
		System.out.println("comparatorem po nazwie:");
		Arrays.sort(products, new Product.ProductNameComparator());
		for (Product p : products) {
			System.out.println(p);
		}

		// klasa anonimowa
		System.out.println();

		Arrays.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getProducer().compareTo(o2.getProducer());
			}
		});
		System.out.println("Klasa anonimowa po producencie:");
		for (Product p : products) {
			System.out.println(p);
		}
	}
}
