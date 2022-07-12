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
public class NationalID {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String nID;
	private String NationalID;
	@Enumerated(EnumType.STRING)
	private NationalIdType type;
	
	@ManyToOne
	@JoinColumn(name="contactID")
	private Contact contact;
}
