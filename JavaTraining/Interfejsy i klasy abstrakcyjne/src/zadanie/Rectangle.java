package zadanie;

public class Rectangle implements Shape {
	private double a;
	private double b;

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public Rectangle(double a, double b) {
		setA(a);
		setB(b);
	}

	@Override
	public double calculatePerimeter() {
		return 2 * a + 2 * b;
	}

	@Override
	public double calculateArea() {
		return a * b;
	}

	@Override
	public String toString() {
		StringBuilder desc = new StringBuilder();
		desc.append("Prostok¹t o bokach: ");
		desc.append("A:" + a + "\n");
		desc.append("B: " + b + "\n");
		desc.append("Pole: " + this.calculateArea() + "\n");
		desc.append("Obwód: " + this.calculatePerimeter());
		return desc.toString();
	}
}
