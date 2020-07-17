package tutorial;

public class NumberComparison {
	public static void main(String[] args) {
		int a = 1000;
		int b = 100;
		int c = 50;
		
		if(a>b) {
			if(a>c) 
				System.out.println("A greater than B and C");
			 else 
				System.out.println("A is greater than B");
			} else {
				System.out.println("A is less than B and C");
		}
	}
}

