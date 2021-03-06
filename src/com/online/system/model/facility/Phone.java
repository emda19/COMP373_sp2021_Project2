package com.online.system.model.facility;

/* This class is used to format a phone number for a facility's manager */
public class Phone implements IPhone {

	private String areaCode;
	private String phoneNumber;
	
	public Phone() {}
	
	//Return the area code
	public String getAreaCode() {
		return this.areaCode;
	}
	
	//Set the area code
	public void setAreaCode(String code) {
		//Validate area code, must be 3 characters long
		if (code.length() == 3) {
			this.areaCode = code;
		} else {
			System.out.println("Error: Invalid area code");
		}
	}
	
	//Return the phone number
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	//Set the phone number
	public void setPhoneNumber(String number) {
		//Validate phone number, must be 7 characters long
		if (number.length() == 7) {
			this.phoneNumber = number;
		} else {
			System.out.println("Error: Invalid phone number");
		}
	}
	
	/*
	//Override toString
	public String toString() {
		if (this.areaCode.length() == 0 || this.phoneNumber.length() == 0) {
			return "Error: Invalid";
		} else {
			String s = "(" + this.areaCode + ") " + this.phoneNumber.substring(0,3) + "-" + this.phoneNumber.substring(3);
			return s;
		}
	}*/
	
}
