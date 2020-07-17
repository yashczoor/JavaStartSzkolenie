package lekcja;

public class CarStaticEngine {
	CarStaticEngine.Engine eng = new CarStaticEngine.Engine();
	
	public static class Engine {
		int fuel;
		
		void consumeFuel() {
			this.fuel = 5;
		}
	}
}
