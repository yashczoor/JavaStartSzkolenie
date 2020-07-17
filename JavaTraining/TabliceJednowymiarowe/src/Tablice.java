public class Tablice {
	public static void main(String[] args) {
		//tablica pusta (z zerami)
		int[] numbers = new int[5];
		//uzupe³niam wartoœci:
		numbers[0]=1;
		numbers[1]=5;
		numbers[2]=10;
		numbers[3]=15;
		numbers[4]=20;
		
		//wyœwietlam to:
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
	}	
}
