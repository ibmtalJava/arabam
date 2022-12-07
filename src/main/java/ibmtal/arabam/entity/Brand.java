package ibmtal.arabam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brands")
public class Brand {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="logo")
	private String logo;
	@Column(name="service_network")
	private boolean serviceNetwork;
	@Column(name="address")
	private String address;
	public Brand() {
		super();
	}
	public Brand(int id, String name, String logo, boolean serviceNetwork, String address) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.serviceNetwork = serviceNetwork;
		this.address = address;
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
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public boolean isServiceNetwork() {
		return serviceNetwork;
	}
	public void setServiceNetwork(boolean serviceNetwork) {
		this.serviceNetwork = serviceNetwork;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
