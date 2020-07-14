package com.gl.springDataDemo.exception;

import org.springframework.http.ResponseEntity;

public class ApiRequestException extends RuntimeException {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApiRequestException(String message) {
		super(message);
	}


	public static String ApiBadRequestException(String message) {
		
		return message;
	}


	

}
