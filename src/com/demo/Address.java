package com.demo;

public class Address {
	
	private int id;
	private String city;
	private String country;
	private String state;
	private String street;
	
	public Address(int id, String city, String country, String state, String street) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.state = state;
		this.street = street;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
