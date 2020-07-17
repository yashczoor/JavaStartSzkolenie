package data;
//protected mog¹ byæ, jak s¹ w tym samym package
public class Car {
	//FIELDS
	private int year;
	private String brand;
	private String model;
	private String color;
	
	//SETTERS AND GETTERS
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//CONSTRUCTORS
	
	/*public Car(int year, String brand, String model, String color){
		this(year, brand, model);
		this.color = color;
	}*/

	public Car(int year, String brand, String model, String color){
		this.setYear(year);
		this.setBrand(brand);
		this.setModel(model);
		this.setColor(color);
	}
}

