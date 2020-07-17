package logic;
import data.Point;

public class PointCtrl {
	public void addX(Point point) {
		point.setX(point.getX()+1);
	}
	
	public void minusX(Point point) {
		point.setX(point.getX()-1);
	}
	
	public void addY(Point point) {
		point.setY(point.getY()+1);
	}
	
	public void minusY(Point point) {
		point.setY(point.getY()-1);
	}
	
	public void showCoordinates(Point point) {
		System.out.println("X: " + point.getX() + " " + "Y: " + point.getY());
	}
	public void changeObject(Point p) {
		p = new Point(-100,-100);
		//nie wp³ywa na obiekt, bo pomimo referencji tworzy now¹ instancjê
	}
}
