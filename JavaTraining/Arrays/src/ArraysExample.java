import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		String[] names = { "Basia", "Kasia", "Wojtek", "Agnieszka", "Kaceper" };
		Integer[] numbers = { 4, 7, 2, 1, 14, 23, 150, 5 };

		System.out.println("Names: ");
		printArray(names);

		System.out.println("Numbers: ");
		printArray(numbers);
		// sortowanie
		System.out.println();
		System.out.println("Posortowane numbers");
		Arrays.sort(numbers);
		printArray(numbers);

		System.out.println("Posortowane names:");
		Arrays.sort(names);
		printArray(names);

		System.out.println();
		// copyOf
		System.out.println("Numbers2 copyOf");
		Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length );
		printArray(numbers2);
		System.out.println();
		// equals
		System.out.println("Equals numbers do numbers2");
		System.out.println(Arrays.equals(numbers, numbers2));
		System.out.println();

		// fill
		System.out.println("Fill array");
		String[] strings = new String[5];
		Arrays.fill(strings, "Wacek");
		printArray(strings);
		//zwraca pozycje w tablicy posortowanej
		System.out.println(Arrays.binarySearch(names, "Agnieszka"));
	}

	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t + " ");
		}
		System.out.println();
	}
}
