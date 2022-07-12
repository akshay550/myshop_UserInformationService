package com.myshop.UserInformationService.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String prefix;
	private String userName;
	@OneToOne(targetEntity = Contact.class, mappedBy = "user", fetch=FetchType.EAGER)
	private Contact contact;
	@OneToMany(targetEntity=Address.class, mappedBy="user", fetch=FetchType.EAGER)
	private List<Address> addresses;
	private LocalDate dateOfBirth;
	@Transient
	private String password;
	@OneToOne(targetEntity = Wallet.class, mappedBy = "user", fetch = FetchType.LAZY)
	private Wallet wallet;
	
}
