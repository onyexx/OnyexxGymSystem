package za.co.MyGymSystem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personalinformations")
public class Personalinformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer information_id;
	private String employer_name;
	private String occupation;
	private String employment_duration;
	private String gross_income;
	private String net_income;
	private String gross_monthly_expenses;
	private String company_suburb;
	private String city;
	private int postal_code;
	private String bank_name;
	private String branch_name;
	private int branch_code;
	private String account_holder;
	private String account_type;
	private long account_number;
	private int debit_date;
	@OneToMany(mappedBy = "personalinformation")
	private List<Customer> customer;
	
	public Personalinformation() {
		super();
	}


	public Personalinformation(Integer information_id, String employer_name, String occupation,
			String employment_duration, String gross_income, String net_income, String gross_monthly_expenses,
			String company_suburb, String city, int postal_code, String bank_name, String branch_name, int branch_code,
			String account_holder, String account_type, long account_number, int debit_date) {
		super();
		this.information_id = information_id;
		this.employer_name = employer_name;
		this.occupation = occupation;
		this.employment_duration = employment_duration;
		this.gross_income = gross_income;
		this.net_income = net_income;
		this.gross_monthly_expenses = gross_monthly_expenses;
		this.company_suburb = company_suburb;
		this.city = city;
		this.postal_code = postal_code;
		this.bank_name = bank_name;
		this.branch_name = branch_name;
		this.branch_code = branch_code;
		this.account_holder = account_holder;
		this.account_type = account_type;
		this.account_number = account_number;
		this.debit_date = debit_date;
	}


	public Integer getInformation_id() {
		return information_id;
	}


	public void setInformation_id(Integer information_id) {
		this.information_id = information_id;
	}


	public String getEmployer_name() {
		return employer_name;
	}


	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public String getEmployment_duration() {
		return employment_duration;
	}


	public void setEmployment_duration(String employment_duration) {
		this.employment_duration = employment_duration;
	}


	public String getGross_income() {
		return gross_income;
	}


	public void setGross_income(String gross_income) {
		this.gross_income = gross_income;
	}


	public String getNet_income() {
		return net_income;
	}


	public void setNet_income(String net_income) {
		this.net_income = net_income;
	}


	public String getGross_monthly_expenses() {
		return gross_monthly_expenses;
	}


	public void setGross_monthly_expenses(String gross_monthly_expenses) {
		this.gross_monthly_expenses = gross_monthly_expenses;
	}


	public String getCompany_suburb() {
		return company_suburb;
	}


	public void setCompany_suburb(String company_suburb) {
		this.company_suburb = company_suburb;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPostal_code() {
		return postal_code;
	}


	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}


	public String getBank_name() {
		return bank_name;
	}


	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}


	public String getBranch_name() {
		return branch_name;
	}


	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}


	public int getBranch_code() {
		return branch_code;
	}


	public void setBranch_code(int branch_code) {
		this.branch_code = branch_code;
	}


	public String getAccount_holder() {
		return account_holder;
	}


	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}


	public String getAccount_type() {
		return account_type;
	}


	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}


	public long getAccount_number() {
		return account_number;
	}


	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}


	public int getDebit_date() {
		return debit_date;
	}


	public void setDebit_date(int debit_date) {
		this.debit_date = debit_date;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((information_id == null) ? 0 : information_id.hashCode());
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
		Personalinformation other = (Personalinformation) obj;
		if (information_id == null) {
			if (other.information_id != null)
				return false;
		} else if (!information_id.equals(other.information_id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Personalinformation [information_id=" + information_id + ", employer_name=" + employer_name
				+ ", occupation=" + occupation + ", employment_duration=" + employment_duration + ", gross_income="
				+ gross_income + ", net_income=" + net_income + ", gross_monthly_expenses=" + gross_monthly_expenses
				+ ", company_suburb=" + company_suburb + ", city=" + city + ", postal_code=" + postal_code
				+ ", bank_name=" + bank_name + ", branch_name=" + branch_name + ", branch_code=" + branch_code
				+ ", account_holder=" + account_holder + ", account_type=" + account_type + ", account_number="
				+ account_number + ", debit_date=" + debit_date + "]";
	}


}
