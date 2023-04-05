package com.user.service.service;

import org.springframework.stereotype.Component;

import com.user.service.beans.ResponseTemplate;
import com.user.service.entity.User;

@Component
public interface UserService {
   
	public default User saveUser(User user) {
		return null;
	}

	public ResponseTemplate getResponseTemplate(Long id);
}
