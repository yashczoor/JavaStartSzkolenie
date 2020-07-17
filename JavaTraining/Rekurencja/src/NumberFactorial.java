
public class NumberFactorial {
	public static void main(String[] args) {
		NumberFactorial nf = new NumberFactorial();
		
		int result = nf.factorial(5);
		System.out.println(result);
	}
	
	public int factorial(int n) {
		if(n > 1) {
			return n * factorial(n - 1);
		} else {
			return n;
		}
	}
}
