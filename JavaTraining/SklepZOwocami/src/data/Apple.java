package data;

public class Apple extends Fruit{
	private String type;
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Apple(String type) {
		setType(type);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.print(" Jab³ko " + type);
	}
}
