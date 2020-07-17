package zadanie;

public interface Shape {
	int RECTANGLE = 1;
	int CIRCLE = 2;
	int TRIANGLE = 3;
	
	double PI = 3.14;

	double calculatePerimeter();
	double calculateArea();
	
	public default void printCalculations() {
		System.out.println("Pole: " + this.calculateArea() + "\n");
		System.out.println("Obwód: " + this.calculatePerimeter());
	}
	//void getData();
	//nie, bo nie stworzy sam siebie. Moglby tylko 
	//zmieniac wymiary
}
