package Lekcja;

public interface CarInterface {
	default public void printName() {
		System.out.println("Car");
	}
}
