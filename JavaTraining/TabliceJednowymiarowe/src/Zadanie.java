import java.util.Random;

public class Zadanie {
	public static void main(String[] args) {
		
		int[] firstArr = new int[3];
		int[] secondArr = new int[3];
		int sumOfArrays = 0;
		
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = new Random().nextInt(10);
			secondArr[i] = new Random().nextInt(10);
			sumOfArrays += firstArr[i] + secondArr[i];
		}	

		System.out.println("Suma wartoœci tablic to: " + sumOfArrays);
	}
}
