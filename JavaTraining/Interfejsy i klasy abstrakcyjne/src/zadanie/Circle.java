package zadanie;

public class Circle implements Shape{
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
		return 2 * Shape.PI * r;
	}

	@Override
	public double calculateArea() {
		return Math.pow(r, 2) * Shape.PI;
	}
	
	@Override
	public String toString() {
		StringBuilder desc = new StringBuilder();
		desc.append("Ko³o o wymiarach: ");
		desc.append("R: " + r + "\n");
		desc.append("Pole: " + this.calculateArea() + "\n");
		desc.append("Obwód: " + this.calculatePerimeter());
		return desc.toString();
	}
}
