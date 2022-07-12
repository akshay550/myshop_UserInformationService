package com.myshop.UserInformationService.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Wallet {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String walletID;
	private BigDecimal walletLimit;
	private BigDecimal outstandingAmount;
	private BigDecimal balance;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

}
