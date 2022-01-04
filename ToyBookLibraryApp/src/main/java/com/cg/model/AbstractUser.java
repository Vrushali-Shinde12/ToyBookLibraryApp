package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AbstractUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_name")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mobile_number")
	private String mobile;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email_id")
	private String email;
	
	@Column(name="gender")
	private String gender;
	

	public AbstractUser(String username, String password, String mobile, String address, String email, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.gender = gender;
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


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", password=" + password + ", mobile=" + mobile + ", address="
				+ address + ", email=" + email + ", gender=" + gender + "]";
	}
	

}
