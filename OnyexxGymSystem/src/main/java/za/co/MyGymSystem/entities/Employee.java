package za.co.MyGymSystem.entities;



import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employee_id;
	private String firstname;
	private String lasname;
	private String email;
	private String gender;
	private String id_passport_number;
	private String city;
	private String province;
	private String country;
	private int postalCode;
	private String suburb;
	private String street;
	private String nationality;
	private String position;
	private String username;
	private String password;
	private LocalDate dateofbirth;
	private long phonenumber;
	
	public Employee() {
		super();
	}

	public Employee(int employee_id, String firstname, String lasname, String email, String gender,
			String id_passport_number, String city, String province, String country, int postalCode, String suburb,
			String street, String nationality, String position, String username, String password, LocalDate dateofbirth,
			long phonenumber) {
		super();
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lasname = lasname;
		this.email = email;
		this.gender = gender;
		this.id_passport_number = id_passport_number;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
		this.suburb = suburb;
		this.street = street;
		this.nationality = nationality;
		this.position = position;
		this.username = username;
		this.password = password;
		this.dateofbirth = dateofbirth;
		this.phonenumber = phonenumber;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasname() {
		return lasname;
	}

	public void setLasname(String lasname) {
		this.lasname = lasname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getId_passport_number() {
		return id_passport_number;
	}

	public void setId_passport_number(String id_passport_number) {
		this.id_passport_number = id_passport_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
		
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

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employee_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employee_id != other.employee_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", firstname=" + firstname + ", lasname=" + lasname + ", email="
				+ email + ", gender=" + gender + ", id_passport_number=" + id_passport_number + ", city=" + city
				+ ", province=" + province + ", country=" + country + ", postalCode=" + postalCode + ", suburb="
				+ suburb + ", street=" + street + ", nationality=" + nationality + ", position=" + position
				+ ", username=" + username + ", password=" + password + ", dateofbirth=" + dateofbirth
				+ ", phonenumber=" + phonenumber + "]";
	}	

}
