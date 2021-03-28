package com.online.system.model.facility;

import java.util.Date;

/* This class is used to hold all facility information */
public class FacilityInfo implements IFacilityInfo {

	private String facilityID;
	private String name;
	private IAddress address;
	private IFacilityManager manager;
	private ICapacity capacity;
	private Date dateOpened;
	
	public FacilityInfo() {}
	
	//Set the ID number of the facility
	public void setFacilityID(String id) {
		this.facilityID = id;
	}

	//Return the ID number of the facility
	public String getFacilityID() {
		return this.facilityID;
	}
	
	//Set the name of the facility
	public void setFacilityName(String name) {
		this.name = name;
	}
		
	//Return the name of the facility
	public String getFacilityName() {
		return this.name;
	}
	
	//Set the address of the facility
	public void setFacilityAddress(IAddress ad) {
		this.address = ad;
	}
		
	//Return the address of the facility
	public IAddress getFacilityAddress() {
		return this.address;
	}

	//Set the manager of the facility
	public void setFacilityManager(IFacilityManager manager) {
		this.manager = manager;
	}

	//Return the manager of the facility
	public IFacilityManager getFacilityManager() {
		return this.manager;
	}

	//Set the capacity of the facility
	public void setCapacity(ICapacity capacity) {
		this.capacity = capacity;
	}

	//Return the capacity of the facility
	public ICapacity getCapacity() {
		return this.capacity;
	}
	
	//Set the date the facility opened
	public void setDateOpened(Date date) {
		this.dateOpened = date;
	}
	
	//Return the date the facility opened
	public Date getDateOpened() {
		return this.dateOpened;
	}
	
	/*
	public String toString() {
		String id = "ID: " + this.facilityID;
		String name = "Building Name : " + this.name;
		String address = this.address.toString();
		String manager = this.manager.toString();
		return id + "\n" + name + "\n" + address + "\n" + manager;
	}
	*/
	
}
