package lekcja;

public class Car {
	private Engine engine;
	private int fuel;
	
	public Car() {
		engine = new Engine("Ferrari");
		System.out.println("Utworzono samochód z silnikiem " + engine.engineType);	
	}
	
	public void go() throws InterruptedException{
		while(fuel > 0) {
			engine.consumeFuel();
			System.out.println("Pozosta³o " + fuel + " litrów paliwa");
			Thread.sleep(1000);
		}
		System.out.println("Brak paliwa");
	}
	
	public void refuel(int liters) {
		fuel = fuel + liters;
	}
	
	public class Engine {
		private String engineType;
		private static final int FUEL_CONSUMPTION = 20;
		int fuel;
		
		public Engine(String type) {
			engineType = type;
		}
		
		public void consumeFuel() {
			fuel = fuel - FUEL_CONSUMPTION;
		}
		
		@Override
		public String toString() {
			return engineType;
		}
		
		void setFuel() {
			this.fuel = 5;
			//dot pola Engine
			Car.this.fuel = 5;
			//dot pola klasy otaczajacej (Car)
		}
	}
	
}
