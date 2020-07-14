package com.gl.springDataDemo.exception;

import org.springframework.http.HttpStatus;

public class ApiException {
	
	
	private final String message;
	private final HttpStatus httpstatus;
	
		
	public ApiException(String message, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.httpstatus = httpstatus;
	}
	
	public String getMessage() {
		return message;
	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

}
