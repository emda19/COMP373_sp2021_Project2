package com.online.system.model.use;

public class FacilityUser implements IFacilityUser {

	private String userID;
	private String firstName;
	private String lastName;
	
	public FacilityUser() {}
	
	//Get User ID
	public String getUserID() {
		return this.userID;
	}
	
	//Set User ID
	public void setUserID(String id) {
		this.userID = id;
	}
	
	//Get First Name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Set First Name
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	//Get Last Name
	public String getLastName() {
		return this.lastName;
	}
	
	//Set Last Name
	public void setLastName(String last) {
		this.lastName = last;
	}
	
}
