package com.online.system.model.facility;

public class FacilityManager implements IFacilityManager {

	private String managerID;
	private String firstName;
	private String lastName;
	private IPhone phoneNumber;
	
	public FacilityManager() {}
	
	/* non-default constructor
	public FacilityManager(String id, String first, String last, Phone pn) {
		this.managerID = id;
		this.firstName = first;
		this.lastName = last;
		this.phoneNumber = pn;
	}*/
	
	//Get Manager ID
	public String getManagerID() {
		return this.managerID;
	}
	
	//Set Manager ID
	public void setManagerID(String id) {
		this.managerID = id;
	}
	
	//Get first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Set first name
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	//Get last name
	public String getLastName() {
		return this.lastName;
	}
	
	//Set last name
	public void setLastName(String last) {
		this.lastName = last;
	}
	
	//Get phone number
	public IPhone getPhoneNumber() {
		return this.phoneNumber;
	}
	
	//Set phone number
	public void setPhoneNumber(IPhone number) {
		this.phoneNumber = number;
	}
	
	/*
	public String toString() {
		String id = "ID: " + this.managerID;
		String name = this.firstName + " " + this.lastName;
		String phone = this.phoneNumber.toString();
		return id + "\n" + name + "\n" + phone;
	}
	*/
}
