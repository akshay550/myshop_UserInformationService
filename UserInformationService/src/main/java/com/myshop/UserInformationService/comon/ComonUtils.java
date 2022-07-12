package com.myshop.UserInformationService.comon;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;

import msmodels.users.User;

public class ComonUtils {
	
	public static User convertEntityToUserDTO(com.myshop.UserInformationService.entity.User userObUser) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
		User user = mapper.map(userObUser, User.class);
		return user;
	}

}
