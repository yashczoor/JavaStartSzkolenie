package Lekcja;

public interface Shape {
	double PI = 3.14; //domy�lnie jest public static final
	//czyli sta�a
	
	double calculatePerimeter();
	double calculateArea(); 
	//domy�lnie s� public i abstract
	//czyli trzeba je Ovverride
	
}
