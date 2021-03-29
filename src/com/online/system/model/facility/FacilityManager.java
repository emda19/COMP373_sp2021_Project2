package com.online.system.model.facility;

/* This class is used to hold information for the manager of a facility */
public class FacilityManager implements IFacilityManager {

	private String managerID;
	private String firstName;
	private String lastName;
	private IPhone phone;
	
	public FacilityManager() {}
	
	/* non-default constructor
	public FacilityManager(String id, String first, String last, Phone pn) {
		this.managerID = id;
		this.firstName = first;
		this.lastName = last;
		this.phoneNumber = pn;
	}*/
	
	//Return the manager's ID number
	public String getManagerID() {
		return this.managerID;
	}
	
	//Set the manager's ID number
	public void setManagerID(String id) {
		this.managerID = id;
	}
	
	//Return the manager's first name
	public String getFirstName() {
		return this.firstName;
	}
	
	//Set the manager's first name
	public void setFirstName(String first) {
		this.firstName = first;
	}
	
	//Return the manager's last name
	public String getLastName() {
		return this.lastName;
	}
	
	//Set the manager's last name
	public void setLastName(String last) {
		this.lastName = last;
	}
	
	//Return the manager's phone number
	public IPhone getPhone() {
		return this.phone;
	}
	
	//Set the manager's phone number
	public void setPhone(IPhone number) {
		this.phone = number;
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
