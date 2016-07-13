package com.validateUser.controller;

import javax.validation.constraints.*;


public class PersonForm {
	
	@NotNull
	@Pattern(regexp="[a-zA-Z]+")
	@Size(min=5, max=20)
	private String name;
	
	@Min(value=1)
	@Max(value=150)
	private int age;

	@NotNull
	@Pattern(regexp="[a-zA-Z]+")
	@Size(min=5, max=10)
	private String username;
	
	@Min(value=1)
	@Max(value=32)
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
}