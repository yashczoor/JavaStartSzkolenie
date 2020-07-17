package zadanie;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalcLogic {
	private Scanner sc;

	public CalcLogic() {
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
	}

	public void closeInput() {
		sc.close();
	}

	public void printOptions() {
		System.out.println(Shape.RECTANGLE + " - Prostok¹t");
		System.out.println(Shape.CIRCLE + " - Okr¹g");
		System.out.println(Shape.TRIANGLE + " - Trójk¹t");
	}

	public Shape createShape() throws NoSuchElementException, InputMismatchException {
		try {
			int type = sc.nextInt();
			sc.nextLine();
			switch (type) {
			case Shape.RECTANGLE:
				return createRectangle();
			case Shape.CIRCLE:
				return createCircle();
			case Shape.TRIANGLE:
				return createTriangle();
			default:
				throw new NoSuchElementException();
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}
	}

	private Shape createTriangle() {
		double a;
		double b;
		double c;
		double h;

		System.out.println("D³ugoœæ boku A: ");
		a = sc.nextDouble();
		sc.nextLine();
		System.out.println("D³ugoœæ boku B: ");
		b = sc.nextDouble();
		sc.nextLine();
		System.out.println("D³ugoœæ boku C: ");
		c = sc.nextDouble();
		sc.nextLine();
		System.out.println("Wysokoœæ: ");
		h = sc.nextDouble();
		sc.nextLine();

		return new Triangle(a, b, c, h);
	}

	private Shape createCircle() {
		double r;

		System.out.println("Promieñ ko³a: ");
		r = sc.nextDouble();
		sc.nextLine();

		return new Circle(r);
	}

	private Rectangle createRectangle() {
		double a = 0;
		double b = 0;

		System.out.println("D³ugoœæ boku A: ");
		a = sc.nextDouble();
		sc.nextLine();
		System.out.println("D³ugoœæ boku B: ");
		b = sc.nextDouble();
		sc.nextLine();

		return new Rectangle(a, b);
	}

}
