package com.example.auth_user.DTO;

import javax.persistence.Column;

public class supplierDTO {

	    private Integer id_supplier;
	    private String name;
	    private String username;
	    private String password;
	    private  Integer age;
	    private String profile_photo;
	    private String phone_number;
	    private String web_page;
	    private  String social_media;
	    private String descripction;
	    
		public supplierDTO(Integer id_supplier, String name, String username, String password, Integer age,
				String profile_photo, String phone_number, String web_page, String social_media, String descripction) {
			super();
			this.id_supplier = id_supplier;
			this.name = name;
			this.username = username;
			this.password = password;
			this.age = age;
			this.profile_photo = profile_photo;
			this.phone_number = phone_number;
			this.web_page = web_page;
			this.social_media = social_media;
			this.descripction = descripction;
		}

		public supplierDTO() {
			
		}

		public Integer getId_supplier() {
			return id_supplier;
		}

		public void setId_supplier(Integer id_supplier) {
			this.id_supplier = id_supplier;
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

		public String getPhone_number() {
			return phone_number;
		}

		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}

		public String getWeb_page() {
			return web_page;
		}

		public void setWeb_page(String web_page) {
			this.web_page = web_page;
		}

		public String getSocial_media() {
			return social_media;
		}

		public void setSocial_media(String social_media) {
			this.social_media = social_media;
		}

		public String getDescripction() {
			return descripction;
		}

		public void setDescripction(String descripction) {
			this.descripction = descripction;
		}

		@Override
		public String toString() {
			return "supplierDTO [id_supplier=" + id_supplier + ", name=" + name + ", username=" + username
					+ ", password=" + password + ", age=" + age + ", profile_photo=" + profile_photo + ", phone_number="
					+ phone_number + ", web_page=" + web_page + ", social_media=" + social_media + ", descripction="
					+ descripction + "]";
		}
		
		
		
		
	
	    
	    
	
}
