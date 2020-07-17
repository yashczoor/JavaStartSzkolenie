package lekcja;

public class Outer {
	private int x;
	
	public void doSomething() {
		int localVar = 5;
		
		class Inner{
			public void innerMethod() {
				x = 5;
				System.out.println(localVar);
			}
		}
	}
}
