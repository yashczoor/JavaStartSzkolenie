package klasaString;

public class takieSame {
	public static void main(String[] args) {
		
	
	String s1 = "ania";
	String s2 = "ania";
	//to jest ten sam obiekt, bo takie same Stringi s¹ przechowywane w jednym
	System.out.println("s1 == s2 " + (s1 == s2));
	System.out.println("s1.equals(s2) " + s1.equals(s2));
	
	String s3 = new String("Ania");
	String s4 = new String("Ania");
	//a to ju¿ osobne obiekty
	System.out.println("s3 == s4 " + (s3 == s4));
	System.out.println("s3.equals(s4) " + s3.equals(s4));
	}
}
