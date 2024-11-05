package com.mvc.model;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class User {
	@NotNull(message = "Name should not be null")
	@Size(min = 8, max = 50, message = "Name should atleast 8 chars and atmost 50 characters")
	private String name;
	@NotNull(message = "Email should not be empty")
	@Email(message = "Email should be in correct format(xyz@gmail.com)")
	private String email;
	@NotNull(message = "password should not be empty")
	@Size(min = 8, max = 35, message = "minimum 8 chars and maximum 35 chars")
	private String password;
	@NotNull(message = "address should not be null")
	@Size(min = 50, message="address should be minimum 50 chars")
	private String address;
	@NotNull(message = "mobile should not be null")
	@Size(min = 10, max = 10, message = "must be 10 digits")
	private String mobile;
	
	public User() {}

	public User(String name, String email, String password, String address, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
	
}
