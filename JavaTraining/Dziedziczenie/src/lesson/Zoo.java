package lesson;

public class Zoo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.color = "black";
		Bird bird = new Bird();
		bird.color = "blue";
		System.out.println(cat.color + " Kot: ");
		cat.makeSound();

		System.out.println(bird.color + " Ptak: ");
		bird.makeSound();
	}

}
