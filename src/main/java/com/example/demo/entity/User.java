package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String email;
    private String password;
    private String role;
    
    private String resetToken;
    private LocalDateTime tokenExpiration;
    
    
  @ManyToOne
  @JoinColumn(name = "master_id") 
  private MasterUser master;
    

    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public MasterUser getMaster() {
		return master;
	}
	public void setMaster(MasterUser master) {
		this.master = master;
	}
	public String getResetToken() {
		return resetToken;
	}
	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}
	public LocalDateTime getTokenExpiration() {
		return tokenExpiration;
	}
	public void setTokenExpiration(LocalDateTime tokenExpiration) {
		this.tokenExpiration = tokenExpiration;
	}
    
    
    
}
	
	
//    private Long user_level;
//    private String election_type;
//    private String country_name;
//    private String state_name;
//    private String constitution;
//    private Long constitution_id;
//    private String email_id;
//    private Long mobile_number;
    

    
    
        
    

