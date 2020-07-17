import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println("Press ENTER to view the array");
		input.nextLine();
		input.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
