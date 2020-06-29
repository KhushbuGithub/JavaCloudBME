package com.javacloud.bookmydoctor.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.javacloud.bookmydoctor.dto.AppiontmentBookingResponse;
import com.javacloud.bookmydoctor.exception.AppiontmentBookingException;

@RestControllerAdvice
public class AppiontmentBookingControllerAdvice {
	
	@ExceptionHandler(AppiontmentBookingException.class)
	public AppiontmentBookingResponse handleAdminException(AppiontmentBookingException e) {
		AppiontmentBookingResponse response = new AppiontmentBookingResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
