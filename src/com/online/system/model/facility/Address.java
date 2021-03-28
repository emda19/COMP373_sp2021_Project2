package com.online.system.model.facility;

/* This class is used to assign an address to each facility */
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
	
	//Return the Street Address
	public String getStreet() {
		return this.street;
	}
	
	//Set the Street Address
	public void setStreet(String street) {
		this.street = street;
	}
	
	//Return the Building Unit Number
	public String getUnit() {
		return this.unit;
	}
	
	//Set the Building Unit Number
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	//Return the City
	public String getCity() {
		return this.city;
	}
	
	//Set the City
	public void setCity(String city) {
		this.city = city;
	}
	
	//Return the State
	public String getState() {
		return this.state;
	}
	
	//Set the State
	public void setState(String state) {
		this.state = state;
	}
	
	//Return the Zipcode
	public String getZipcode() {
		return this.zipcode;
	}
	
	//Set the Zipcode
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
