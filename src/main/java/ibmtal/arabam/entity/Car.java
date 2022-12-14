package ibmtal.arabam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id")
	private int id;
	@Column(name="name")	
	private String name;
	@ManyToOne()
	@JoinColumn(name="brand")	
	private Brand brand;
	@Column(name="price")
	private double price;
	public Car() {
		super();
	}
	public Car(int id, String name, Brand brand, double price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
