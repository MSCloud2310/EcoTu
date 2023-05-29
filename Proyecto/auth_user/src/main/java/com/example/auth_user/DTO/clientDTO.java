package com.example.auth_user.DTO;

import javax.persistence.Column;

public class clientDTO {

	private Integer id_client;
	private String name;
	private String username;
	private String password;
	private Integer age;
	private String profile_photo;
	private String descripction;
	
	public clientDTO(Integer id_client, String name, String username, String password, Integer age,
			String profile_photo, String descripction) {
		super();
		this.id_client = id_client;
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
		this.profile_photo = profile_photo;
		this.descripction = descripction;
	}

	public clientDTO() {
	
	}

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getProfile_photo() {
		return profile_photo;
	}

	public void setProfile_photo(String profile_photo) {
		this.profile_photo = profile_photo;
	}

	public String getDescripction() {
		return descripction;
	}

	public void setDescripction(String descripction) {
		this.descripction = descripction;
	}

	@Override
	public String toString() {
		return "clientDTO [id_client=" + id_client + ", name=" + name + ", username=" + username + ", password="
				+ password + ", age=" + age + ", profile_photo=" + profile_photo + ", descripction=" + descripction
				+ "]";
	}
	

	
	
	
}
