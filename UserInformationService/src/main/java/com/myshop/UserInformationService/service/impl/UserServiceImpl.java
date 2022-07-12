package com.myshop.UserInformationService.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.UserInformationService.comon.ComonUtils;
import com.myshop.UserInformationService.entity.User;
import com.myshop.UserInformationService.repository.UserRepository;
import com.myshop.UserInformationService.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public msmodels.users.User getUser(String userName) {
		// TODO Auto-generated method stub
		User user = userRepository.findByUserName(userName);
		
		return ComonUtils.convertEntityToUserDTO(user);
	}

}
