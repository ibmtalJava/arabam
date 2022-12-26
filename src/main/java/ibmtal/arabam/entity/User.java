package ibmtal.arabam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String username;
	@Column(name ="password")
	private String password;
	@Column(name ="token")
	private String token;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="birthday")
	private String birthday;
	@Column(name="country")
	private String country;
	@Column(name="photo")
	private String photo;
	@Column(name="gender")
	private String gender;
	@Column(name="phone")
	private String phone;
	@Column(name="tc")
	private String tc;
	public User() {
		super();
	}
	public User(int id, String username, String password, String token, String name, String surname, String birthday,
			String country, String photo, String gender, String phone, String tc) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.token = token;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.country = country;
		this.photo = photo;
		this.gender = gender;
		this.phone = phone;
		this.tc = tc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTc() {
		return tc;
	}
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	
}
