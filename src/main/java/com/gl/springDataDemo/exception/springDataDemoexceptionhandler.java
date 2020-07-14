package com.gl.springDataDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gl.springDataDemo.exception.*;

@ControllerAdvice
public class springDataDemoexceptionhandler{


	//ApiRequestException apiRequestException = new ApiRequestException("ss"); 
	 
	@ExceptionHandler
	@ResponseBody
	public ResponseEntity<Object> handleApiBadRequestException(ApiRequestException e){
		ApiException apiException = new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<Object>(apiException,HttpStatus.BAD_REQUEST );
}
/*
 * @ExceptionHandler
 * 
 * @ResponseBody public ResponseEntity<Object>
 * handleApiBad1RequestException(ApiRequestException e){ ApiException
 * apiException = new ApiException(e.getMessage(), HttpStatus.BAD_REQUEST);
 * return new ResponseEntity<Object>(apiException,HttpStatus.BAD_REQUEST ); }
 */
	
	
}