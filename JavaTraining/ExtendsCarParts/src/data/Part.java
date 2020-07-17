package data;

public class Part {
	private int id;
	private String manufacturer;
	private String productName;
	private String productSeries;
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductSeries() {
		return productSeries;
	}
	public void setProductSeries(String productSeries) {
		this.productSeries = productSeries;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
