package com.online.system.model.facility;

public class Address {

	private String street;
	private String unit;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String street, String unit, String city, String state, String zipcode) {
		this.street = street;
		this.unit = unit;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	//Get street
	public String getStreet() {
		return this.street;
	}
	
	//Get unit
	public String getUnit() {
		return this.unit;
	}
	
	//Get city
	public String getCity() {
		return this.city;
	}
	
	//Get state
	public String getState() {
		return this.state;
	}
	
	//Get zipcode
	public String getZipcode() {
		return this.zipcode;
	}
	
	/*
	public String toString() {
		String s = street + ", Apt " + unit + "\n" + city + ", " + state + " " + zipcode;
		return s;
	}
	*/
}
