package Lekcja;

public class ShapeCalculator {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rect = new Rectangle(5, 10);
		
		System.out.println("Pole ko�a " + circle.calculateArea());
		System.out.println("Obw�d prostok�ta: " + rect.calculatePerimeter());
	
	}
}
