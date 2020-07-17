package zadanie;

public class Triangle implements Shape {
	private double a;
	private double b;
	private double c;
	private double h;
	
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
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	public Triangle(double a,double b,double c,double h) {
		setA(a);
		setB(b);
		setC(c);
		setH(h);
	}
	
	@Override
	public double calculatePerimeter() {
		return a + b + c;
	}
	@Override
	public double calculateArea() {
		return (a * h)/2;
	}
	
	@Override
	public String toString() {
		StringBuilder desc = new StringBuilder();
		desc.append("Trójk¹t o bokach: ");
		desc.append("A:" + a + "\n");
		desc.append("B: " + b + "\n");
		desc.append("C: " + c + "\n");
		desc.append("Wysokoœci: " + h + "\n");
		desc.append("Pole: " + this.calculateArea() + "\n");
		desc.append("Obwód: " + this.calculatePerimeter());
		return desc.toString();
	}
	
	
	
}
