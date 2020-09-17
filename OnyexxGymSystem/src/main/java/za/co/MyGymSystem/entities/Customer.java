package za.co.MyGymSystem.entities;



import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customer_id;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
    private String id_passport_Number;
    private LocalDate dateOfBirth;
    private String gender;
    private String city;
    private String province;
    private String country;
	private int postalCode;
	private String suburb;
	private String street;
	private String nationality;
	@ManyToOne
	private CustomerPackage customerPackage;
	@ManyToOne
    private Personalinformation personalinformation;
	
	public Customer() {
		super();
	}

	public Customer(Integer customer_id, String firstName, String lastName, String email, long phoneNumber,
			String id_passport_Number, LocalDate dateOfBirth, String gender, String city, String province,
			String country, int postalCode, String suburb, String street, String nationality) {
		super();
		this.customer_id = customer_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.id_passport_Number = id_passport_Number;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
		this.suburb = suburb;
		this.street = street;
		this.nationality = nationality;
	
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId_passport_Number() {
		return id_passport_Number;
	}

	public void setId_passport_Number(String id_passport_Number) {
		this.id_passport_Number = id_passport_Number;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
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
		Customer other = (Customer) obj;
		if (customer_id == null) {
			if (other.customer_id != null)
				return false;
		} else if (!customer_id.equals(other.customer_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", id_passport_Number=" + id_passport_Number
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", city=" + city + ", province=" + province
				+ ", country=" + country + ", postalCode=" + postalCode + ", suburb=" + suburb + ", street=" + street
				+ ", nationality=" + nationality + "]";
	}

	
  
}
