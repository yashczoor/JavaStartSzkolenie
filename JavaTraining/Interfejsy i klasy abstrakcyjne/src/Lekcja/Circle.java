package Lekcja;

public class Circle implements Shape {

	private double r;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public Circle(double r) {
		setR(r);
	}
	
	@Override
	public double calculatePerimeter() {
		return Shape.PI * 2 * r;
	}

	@Override
	public double calculateArea() {
		return Shape.PI * Math.pow(r, 2);
	}

	
}
