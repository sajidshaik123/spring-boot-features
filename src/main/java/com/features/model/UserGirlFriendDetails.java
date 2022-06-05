package com.features.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "UserGirlFriendDetails")
public class UserGirlFriendDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer userGfId;
	public String userGfName;
	public String userGfEmail;
	public String userGfPhoneNumber;
	public String userGfAlternatePhoneNumber;

}
