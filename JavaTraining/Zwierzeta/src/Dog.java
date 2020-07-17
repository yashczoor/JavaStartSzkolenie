
public class Dog extends Animal	{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void giveSound() {
		System.out.println("Jestem psem i nazywam siê " + getName());
	}
	
	public void bark() {
		System.out.println("Woof Woof!");
	}
}
