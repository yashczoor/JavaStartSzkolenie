package zadanie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadWordsToStreams {
	private static final String FILE_NAME = "loremipsum.txt";

	public static void main(String[] args) {
		// POBIERZ SŁOWA
		// ROZDZIEL
		// USUŃ PRZEINKI I KROPKI
		// WYŚWIETL TE ZACZYNAJĄCE SIĘ OD S ORAZ ILE SŁÓW JEST PO PIĘĆ ZNAKÓW
		List<String> words = new ArrayList<>();

		try (FileReader fr = new FileReader(FILE_NAME); BufferedReader br = new BufferedReader(fr);) {

			String word = null;

			while ((word = br.readLine()) != null) {
				words.addAll(Arrays.asList(word.split(" ")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		words = words.stream().filter(x -> x.length() > 0).map(x -> x.replaceAll(",", "").replaceAll("\\.", ""))
				.collect(Collectors.toList());

		System.out.println("Wszystkich słów:" + words.size());

		List<String> wordsWithS = words.stream().filter(x -> x.charAt(0) == 's').collect(Collectors.toList());

		System.out.println(wordsWithS.size());

		List<String> fiveLetterWords = words.stream().filter(x -> x.length() == 5).collect(Collectors.toList());

		System.out.println(fiveLetterWords.size());
		// List<String>wordsWithS = words.stream().filter(x ->
		// x.startsWith("s")).collect(Collectors.toList());
		// System.out.println("Na \"s\" zaczyna się " + wordsWithS.size());

	}
}
