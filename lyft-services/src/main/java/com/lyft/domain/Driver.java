package com.lyft.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="driver")
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long driverId;
	
	@Column(name="name")
	private String name ;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	public Long getdriverId() {
		return driverId;
	}
	public void setRiderId(Long driverId) {
		this.driverId = driverId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", email=" + email + "]";
	}
	

}
