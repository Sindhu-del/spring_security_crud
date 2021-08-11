package com.te.springboot.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private final String username;
	private final String message;
	private final String tokenType;
	
	

	public JwtResponse(String jwttoken, String username, String message,String tokenType) {
		this.jwttoken = jwttoken;
		this.username = username;
		this.message=message;
		this.tokenType = tokenType;
		
	}

	public String getToken() {
		return this.jwttoken;
	}
	public String getUser() {
        return this.username;
    }
	
	public String getMessage() {
		return this.message;
	}
	
	public String getTokenType() {
		return this.tokenType;
	}
	

}
