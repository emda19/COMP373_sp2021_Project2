package com.online.system.model.use;

/* This class is used to hold information of someone using the facility */
public class FacilityUser implements IFacilityUser {

	private String userID;
	private String firstName;
	private String lastName;
	private String unitNumber;
	
	public FacilityUser() {}
	
	//Get the unit number being rented
	public String getUnitNum() {
		return this.unitNumber;
	}
	//Set the unit number being rented
	public void setUnitNum(String unit) {
		this.unitNumber = unit;
	}
	
	//Get the user ID number
	public String getUserID() {
		return this.userID;
	}
	
	//Set the user ID number
	public void setUserID(String id) {
		this.userID = id;
	}
	
	//Return the user's first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Set the user's first name
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	//Return the user's last name
	public String getLastName() {
		return this.lastName;
	}
	
	//Set the user's last name
	public void setLastName(String last) {
		this.lastName = last;
	}
	
}
