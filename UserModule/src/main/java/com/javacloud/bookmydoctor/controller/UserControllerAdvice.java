package com.javacloud.bookmydoctor.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.javacloud.bookmydoctor.dto.UserResponse;
import com.javacloud.bookmydoctor.exception.UserException;


@RestControllerAdvice
public class UserControllerAdvice {
	
	@ExceptionHandler(UserException.class)
	public UserResponse handleUserException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
