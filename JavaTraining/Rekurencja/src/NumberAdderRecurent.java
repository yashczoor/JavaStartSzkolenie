
public class NumberAdderRecurent {
	public static void main(String[] args) {
		NumberAdderRecurent adder = new NumberAdderRecurent();
		
		int num = adder.sum(30);
		System.out.println(num);
	}
	
	public int sum(int n) {
		if(n>1) {
			System.out.println(n + "+" + "sum(" + (n-1) + ")");
			return n + sum(n-1);
		} else {
			return n;
		}
	}
	//stackoverflowerror jak za du¿e liczby
}
