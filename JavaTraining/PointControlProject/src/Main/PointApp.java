package Main;

import data.Point;
import logic.PointCtrl;

public class PointApp {

	public static void main(String[] args) {
		//Point point = new Point();
		
		final int add_x = 1;
		final int minus_x = 2;
		final int add_y = 3;
		final int minus_y = 4;
		
		int movePoint = minus_x;
				
		Point point = new Point(10,20);
		PointCtrl ctrl = new PointCtrl();
		
		ctrl.showCoordinates(point);

		switch(movePoint) {
			case add_x:
				ctrl.addX(point);
				break;
			case minus_x:
				ctrl.minusX(point);
				break;
			case add_y:
				ctrl.addY(point);
				break;
			case minus_y:
				ctrl.minusY(point);
				break;
			default:
				System.out.println("B³ond. Brak takiej opcji przesuniêcia.");
		}
		
		ctrl.showCoordinates(point);
	}
}
