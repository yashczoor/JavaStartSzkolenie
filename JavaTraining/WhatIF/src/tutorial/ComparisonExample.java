package tutorial;

public class ComparisonExample {
	public static void main(String[] args) {
		int a = 10, b = 30, c = 20;
		
		//konstrukcja if else sprawdza warunki a¿ napotka prawdziwy
		if (a>b) {
			System.out.println("A>B");
		} else if(b>c){
			System.out.println("B>C");
		} else if(c>a) {
			System.out.println("C>A");
		} else {
			System.out.println("równe. no ja nie wiem");
		}
		
		//ka¿dy zostanie sprawdzony. Ró¿ne wyniki
		if (a>b) {
			System.out.println("2 A>B");
		} 
		if (b>c) {
			System.out.println("2 B>C");
		}
		if (c>a) {
			System.out.println("2 C>A");
		}
	}
}
