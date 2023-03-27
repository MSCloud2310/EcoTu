package com.example.auth_user.DTO;

public class supplierLoginDTO {

	private String username;
	private String password;
	public supplierLoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public supplierLoginDTO() {
		super();
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
	
	@Override
	public String toString() {
		return "supplierLoginDTO [username=" + username + ", password=" + password + "]";
	}
	
	
}
