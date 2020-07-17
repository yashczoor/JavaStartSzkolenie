package lekcja;

public class CarTest {
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		Car.Engine engine = new Car().new Engine("Ferrari");
		car.refuel(40);
		System.out.println(engine.toString());
		car.go();
	}
}
