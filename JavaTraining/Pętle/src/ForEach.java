
public class ForEach {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		
		for(int tmp: numbers) {
			System.out.println(tmp);//tmp to nie numer ale reprezentacja obiektu
		}
	}
}
