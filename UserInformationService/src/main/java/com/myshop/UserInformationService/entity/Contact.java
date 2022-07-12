package com.myshop.UserInformationService.entity;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Contact {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String contactID;
	private String phone;
	private String mobile;
	private String emailId;
	
	@OneToMany(targetEntity=NationalID.class, mappedBy="contact", fetch=FetchType.LAZY)
	private List<NationalID> nationalIds;
	
	@OneToOne
	@JoinColumn(name="userId")
	private User user;

}
