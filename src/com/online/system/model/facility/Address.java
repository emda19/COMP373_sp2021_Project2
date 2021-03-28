package com.online.system.model.facility;

public class Address implements IAddress {

	private String street;
	private String unit;
	private String city;
	private String state;
	private String zipcode;
	
	public Address() {}
	
	/* non-default constructor
	public Address(String street, String unit, String city, String state, String zipcode) {
		this.street = street;
		this.unit = unit;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}*/
	
	//Get street
	public String getStreet() {
		return this.street;
	}
	
	//Set street
	public void setStreet(String street) {
		this.street = street;
	}
	
	//Get unit
	public String getUnit() {
		return this.unit;
	}
	
	//Set unit
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	//Get city
	public String getCity() {
		return this.city;
	}
	
	//Set city
	public void setCity(String city) {
		this.city = city;
	}
	
	//Get state
	public String getState() {
		return this.state;
	}
	
	//Set state
	public void setState(String state) {
		this.state = state;
	}
	
	//Get zipcode
	public String getZipcode() {
		return this.zipcode;
	}
	
	//Set zipcode
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	/*
	public String toString() {
		String s = street + ", Apt " + unit + "\n" + city + ", " + state + " " + zipcode;
		return s;
	}
	*/
}
