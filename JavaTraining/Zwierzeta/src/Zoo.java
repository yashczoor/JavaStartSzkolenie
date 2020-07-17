
public class Zoo {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog("Barek");
		animals[1] = new Cat("Mruczek");
		animals[2] = new Animal("Gówno Ciê to obchodzi");
		
		for(Animal anim: animals) {
			anim.giveSound();
		}
		
		changeName(animals[1], "Mayo");
		
		for(Animal anim: animals) {
			anim.giveSound();
		}
		
	}
	
	private static void changeName(Animal anim, String newName) {
		anim.setName(newName);
	}
}
