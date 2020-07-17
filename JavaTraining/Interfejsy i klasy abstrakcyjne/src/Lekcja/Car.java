package Lekcja;

public class Car extends Vehicle{

	@Override
	public void speedUp() {
		setSpeed(getSpeed()+5);
	}
	
}
