package com.nagarro.nagp.aggregatorservice.model;

public class User {

	private String email;
	private String name;
	private int age;	
	
	public User() {
	}
		
	public User(String email, String name, int age) {
		this.email = email;
		this.name = name;
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}
