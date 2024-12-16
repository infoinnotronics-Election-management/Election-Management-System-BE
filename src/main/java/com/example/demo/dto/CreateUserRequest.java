package com.example.demo.dto;

public class CreateUserRequest {
    private String masterUsername;
    private String username;
    private String password;
    private String email;
    
    
	public String getMasterUsername() {
		return masterUsername;
	}
	public void setMasterUsername(String masterUsername) {
		this.masterUsername = masterUsername;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    

    
}
