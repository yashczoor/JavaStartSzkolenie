//import data.Car;
package logic;

import data.Car;
//klasa mo¿e byæ public lub default
//ale ju¿ nie protected ani private
public class CarShop {
	public static void main(String[] args) {
		Car car1 = new Car(2018, "Audi", "A4", "czarny");
		Car car2 = new Car(2005, "Nissan", "Tino", "szary");
		
		System.out.println(car1.getYear() + " " + car1.getColor() + " " + car1.getModel() + " " + car1.getBrand());
		System.out.println(car2.getYear() + " " + car2.getColor() + " " + car2.getModel() + " " + car2.getBrand());
	}
}