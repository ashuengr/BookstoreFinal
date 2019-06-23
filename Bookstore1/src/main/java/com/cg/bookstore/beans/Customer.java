package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int customerId;
	private String customerEmailId;
	private String  customerFullName;
	private String customerPassword;
	private String customerMobileNumber;
	private String city;
	private String zipCode;
	private String country;
	public Customer() {
		super();
	}
	public Customer(String customerEmailId, String customerFullName, String customerPassword,
			String customerMobileNumber, String city, String zipCode, String country) {
		super();
		this.customerEmailId = customerEmailId;
		this.customerFullName = customerFullName;
		this.customerPassword = customerPassword;
		this.customerMobileNumber = customerMobileNumber;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((customerEmailId == null) ? 0 : customerEmailId.hashCode());
		result = prime * result + ((customerFullName == null) ? 0 : customerFullName.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerMobileNumber == null) ? 0 : customerMobileNumber.hashCode());
		result = prime * result + ((customerPassword == null) ? 0 : customerPassword.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (customerEmailId == null) {
			if (other.customerEmailId != null)
				return false;
		} else if (!customerEmailId.equals(other.customerEmailId))
			return false;
		if (customerFullName == null) {
			if (other.customerFullName != null)
				return false;
		} else if (!customerFullName.equals(other.customerFullName))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerMobileNumber == null) {
			if (other.customerMobileNumber != null)
				return false;
		} else if (!customerMobileNumber.equals(other.customerMobileNumber))
			return false;
		if (customerPassword == null) {
			if (other.customerPassword != null)
				return false;
		} else if (!customerPassword.equals(other.customerPassword))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerEmailId=" + customerEmailId + ", customerFullName="
				+ customerFullName + ", customerPassword=" + customerPassword + ", customerMobileNumber="
				+ customerMobileNumber + ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
}
