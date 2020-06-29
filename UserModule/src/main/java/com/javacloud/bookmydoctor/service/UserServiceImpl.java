package com.javacloud.bookmydoctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.javacloud.bookmydoctor.dao.UserDAO;
import com.javacloud.bookmydoctor.dto.User;
import com.javacloud.bookmydoctor.exception.UserException;
import com.javacloud.bookmydoctor.validation.Validation;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Override
	public boolean addUser(User user) {
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		return dao.addUser(user);

	}

	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

	@Override
	public boolean deleteUser(int userId) {
		return dao.deleteUser(userId);
	}

	@Override
	public boolean changePassword(int userId, String password) {
		if (Validation.isId(userId)) {
			if (Validation.isPassword(password)) {
				return dao.changePassword(userId, encoder.encode(password));
			} else {
				throw new UserException(
						"The password must contain one lowercase characters, one uppercase characters , one special symbols in the list \"@#$%\" and length at least 6 characters");
			}
		} else {
			throw new UserException("The Id must contain numbers between 0-9 and minimum length of 1");
		}
	}

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

}
