package ibmtal.arabam.dtos;

public class CarAddDto {
	private String name;
	private int brand;
	private double price;
	public CarAddDto() {
		super();
	}
	public CarAddDto(String name, int brand, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
