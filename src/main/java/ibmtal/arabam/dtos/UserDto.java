package ibmtal.arabam.dtos;

public class UserDto {
	private String username;
	private String name;
	private String surname;
	private String photo;
	private String gender;
	private String country;
	public UserDto() {
		super();
	}
	public UserDto(String username, String name, String surname, String photo, String gender, String country) {
		super();
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.photo = photo;
		this.gender = gender;
		this.country = country;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
