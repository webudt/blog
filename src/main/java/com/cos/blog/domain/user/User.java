package com.cos.blog.domain.user;

import java.sql.Timestamp;

public class User { // 1,1
	private Integer id; //primary key, Sequence
	private String username;
	private String password;
	private String email;
	private String address;
	private Timestamp created; // 유저가 만들어진 시간 (필수)
	
	public User() {
		
	}
	
	public User(Integer id, String username, String password, String email, String address, Timestamp created) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.created = created;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	
}
