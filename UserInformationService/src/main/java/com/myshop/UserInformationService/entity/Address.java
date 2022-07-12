package com.myshop.UserInformationService.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String addressID;
	@Enumerated(EnumType.STRING)
	private AddressType addressType;
	private String houseNo;
	private String area1;
	private String area2;
	private String city;
	private String state;
	private String country;
	private String town;
	private String pinCode;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

}
