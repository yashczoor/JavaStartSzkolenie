package ProponowaneRozwiazanie;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		//Main main = new Main();
		
		ShapeCalculator shapeCalc = new ShapeCalculator();
		Shape shape = null;
		
		boolean readComplete = false;
		while(!readComplete) {
			try {
			Main.printOptions();
			shape = shapeCalc.createShape();
			readComplete = true;
			} catch (InputMismatchException e) {
				System.out.println("Dane w z�ym formacie");
			} catch (NoSuchElementException e) {
				System.out.println("Nie ma takiego identyfikatora");
			}
		}
		System.out.println(shape);
		
		shapeCalc.closeScanner();
	}

	public static void printOptions() {
		System.out.println("Wybierz figur�, dla kt�rej chcesz obliczy� pole i obw�d:");
		System.out.println(Shape.RECTANGLE + " - prostok�t");
		System.out.println(Shape.CIRCLE + " - ko�o");
		System.out.println(Shape.TRIANGLE + " - tr�jk�t");
	}

}
