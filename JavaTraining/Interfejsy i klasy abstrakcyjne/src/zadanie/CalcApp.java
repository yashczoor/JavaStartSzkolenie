package zadanie;

import java.util.NoSuchElementException;

public class CalcApp {
	public static void main(String[] args) {
		CalcLogic l = new CalcLogic();
		Shape shp = null;
		boolean readComplete = false;

		System.out.println("Wybierz kszta³t: ");
		while (!readComplete) {
			l.printOptions();
			try {
				shp = l.createShape();
				readComplete = true;
			} catch (NoSuchElementException e) {
				System.out.println("Wybierz jeszcze raz.");
			}
		}

		System.out.println(shp.toString());
		l.closeInput();
	}

}
