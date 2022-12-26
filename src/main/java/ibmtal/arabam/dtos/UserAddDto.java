package ibmtal.arabam.dtos;

public class UserAddDto {
    private String username;
    private String password;
    private String rePassword;
    private String name;
    private String surname;
    private String birthday;
    private String country;
    private String photo;
    private String gender;
    private String phone;
    private String tc;
	public UserAddDto() {
		super();
	}
	public UserAddDto(String username, String password, String rePassword, String name, String surname, String birthday,
			String country, String photo, String gender, String phone, String tc) {
		super();
		this.username = username;
		this.password = password;
		this.rePassword = rePassword;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.country = country;
		this.photo = photo;
		this.gender = gender;
		this.phone = phone;
		this.tc = tc;
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
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
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
