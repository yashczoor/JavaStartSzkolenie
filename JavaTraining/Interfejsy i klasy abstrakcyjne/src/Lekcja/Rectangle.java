package Lekcja;

public class Rectangle implements Shape{
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	//konstruktor
	public Rectangle(double a, double b) {
		setA(a);
		setB(b);
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*a + 2*b;
	}

	@Override
	public double calculateArea() {
		return a*b;
	}

}
