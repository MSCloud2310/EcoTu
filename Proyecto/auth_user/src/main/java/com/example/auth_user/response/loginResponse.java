package com.example.auth_user.response;

public class loginResponse {
	
	String message;
	Boolean status;
	public loginResponse(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public loginResponse() {
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "loginResponse [message=" + message + ", status=" + status + "]";
	}
	
	
	
	

}
