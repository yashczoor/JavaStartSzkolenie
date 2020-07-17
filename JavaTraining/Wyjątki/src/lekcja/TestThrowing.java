package lekcja;

public class TestThrowing {
	public static void main(String[] args) {
		Numbers num = new Numbers();
		try {
		num.add(3, 5);
		
		int number3 = num.get(3);
		System.out.println(number3);
		
		num.add(20, 20);
		
		int number20 = num.get(20);
		System.out.println(number20);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			//pobiera tekst z throwowanego b³êdu
		}
	}
}
