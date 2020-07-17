
public class FactorialTer {
	
	public static void main(String[] args) {
		FactorialTer ft = new FactorialTer();
		
		int factArg = 5;
		int result = ft.factorial(factArg);
		System.out.println(result);
	}
	
	public int factorial(int n) {
		return n>1 ? n*factorial(n-1):1;
	}
	
	
}
