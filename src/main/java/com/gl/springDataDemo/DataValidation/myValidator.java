package com.gl.springDataDemo.DataValidation;

public class myValidator {
	
	public void validateUserId(String mUserid) throws Exception {
		if(mUserid.contains("0")) {
			throw new Exception("User id cannot be 0");
		} 
		}
}
