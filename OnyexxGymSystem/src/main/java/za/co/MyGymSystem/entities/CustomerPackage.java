package za.co.MyGymSystem.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customerpackage")
public class CustomerPackage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int packageId;
	private String packagename;
	private double packageprice;
	@OneToMany(mappedBy = "customerPackage")
	private List<Customer> customer;
	
	public CustomerPackage() {
		super();
	}

	public CustomerPackage(int packageId, String packagename, double packageprice, List<Customer> customer) {
		super();
		this.packageId = packageId;
		this.packagename = packagename;
		this.packageprice = packageprice;
		this.customer = customer;
	}

	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public double getPackageprice() {
		return packageprice;
	}

	public void setPackageprice(double packageprice) {
		this.packageprice = packageprice;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerPackage [packageId=" + packageId + ", packagename=" + packagename + ", packageprice="
				+ packageprice + ", customer=" + customer + "]";
	}


}
