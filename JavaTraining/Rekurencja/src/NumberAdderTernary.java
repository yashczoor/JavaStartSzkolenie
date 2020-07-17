
public class NumberAdderTernary {
	public static void main(String[] args) {
		NumberAdderTernary adder = new NumberAdderTernary();

		int number = adder.sum(100);
		System.out.println(number);
	}

	public int sum(int n) {
		return n > 1 ? n + sum(n - 1) : n;
	}
}
