package lekcja;

import java.time.Duration;
import java.time.Instant;

public class CoToInstant {
	public static void main(String[] args) {

		Instant i1 = Instant.now();
		for (int i = 0; i < 100; i++) {
			System.out.println("Miernik czasu");
		}
		Instant i2 = Instant.now();
		Duration duration = Duration.between(i1, i2);
		System.out.println("Upłynęło " + duration.getNano() + " nanosekund");
		System.out.println("Upłynęło " + duration.getSeconds() + " sekund");

		// aktualny czas
		System.out.println(Instant.now());
		// tyle milisekund od 1970
		System.out.println(Instant.ofEpochMilli(100));
		// jw ale w sekundach
		System.out.println(Instant.ofEpochSecond(100));

	}
}
