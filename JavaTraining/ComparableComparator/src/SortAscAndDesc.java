import java.util.Arrays;
import java.util.Comparator;

public class SortAscAndDesc {
	public static void main(String[] args) {
		Integer[] nums = { 1, 11, 111, 23, 45, 98, 87, 76, 65, 54, 43, 32, 21, 0, 123, 345, 567, 687, 900, 23 };

		System.out.println("Nums");
System.out.println(Arrays.toString(nums));
		System.out.println();

		Arrays.sort(nums);

		System.out.println("Nums asc:");
		printOut(nums);

		System.out.println();

		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer num1, Integer num2) {
				return -(num1.compareTo(num2));
			}
		});
		System.out.println("Desc:");
		printOut(nums);
	}

	public static <T> void printOut(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
}
