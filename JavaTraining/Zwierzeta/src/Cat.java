
public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void giveSound() {
		System.out.println("Moja godnoœæ to " + getName());
	}
	
	public void meow() {
		System.out.println("Meoooooow!");
	}
}
