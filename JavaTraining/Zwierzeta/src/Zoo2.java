
public class Zoo2 {
	public static void main(String[] args) {
		Animal dog = new Dog("Barek");
		Animal cat = new Cat("Kisielek");
		
		//rzutowanie do zmiennej
		Dog specificDog = (Dog)dog;
		specificDog.bark();
		
		//rzutowanie w locie
		((Cat)cat).meow();
	}
}
