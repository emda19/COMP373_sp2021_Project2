package com.online.system.model.use;

public class FacilityUser {

	private String userID;
	private String firstName;
	private String lastName;
	
	public FacilityUser(String id, String first, String last) {
		this.userID = id;
		this.firstName = first;
		this.lastName = last;
	}
	
	//Get Renter ID
	public String getRenterID() {
		return this.userID;
	}
	
	//Get first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Get last name
	public String getLastName() {
		return this.lastName;
	}
	
}
