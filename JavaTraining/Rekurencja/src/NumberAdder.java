
public class NumberAdder {
	public static void main(String[] args) {
		NumberAdder adder = new NumberAdder();

		int num = adder.sum(5);
		System.out.println(num);
	}

	public int sum(int n) {
		int sum = 0;

		while (n > 0) {
			sum = sum + n;
			n--;
		}
		return sum;
	}
}
