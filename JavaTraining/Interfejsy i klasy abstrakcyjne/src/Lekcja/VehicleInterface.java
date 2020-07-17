package Lekcja;

public interface VehicleInterface {
	default public int speedUp(int speed) {
		return speed++;
	}
}
