package Lekcja;

public class ShapeCalculator {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rect = new Rectangle(5, 10);
		
		System.out.println("Pole ko³a " + circle.calculateArea());
		System.out.println("Obwód prostok¹ta: " + rect.calculatePerimeter());
	
	}
}
