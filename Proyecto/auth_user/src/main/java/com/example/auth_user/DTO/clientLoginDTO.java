package com.example.auth_user.DTO;

public class clientLoginDTO {
	
	private String username;
	private String password;
	
	public clientLoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public clientLoginDTO() {
		
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
		return "clientLoginDTO [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	

}
