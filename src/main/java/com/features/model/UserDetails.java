package com.features.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetails extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer userId;
	public String userName;
	public String userEmail;
	public String userPhoneNumber;
	public String userUlternatePhoneNumber;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserUlternatePhoneNumber() {
		return userUlternatePhoneNumber;
	}

	public void setUserUlternatePhoneNumber(String userUlternatePhoneNumber) {
		this.userUlternatePhoneNumber = userUlternatePhoneNumber;
	}

}
