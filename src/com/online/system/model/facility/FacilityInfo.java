package com.online.system.model.facility;

public class FacilityInfo {

	private String facilityID;
	private String name;
	private Address address;
	private FacilityManager manager;
	private FacilityCapacity capacity;
	private int daysOpen;
	
	public FacilityInfo() {
		setFacilityManager(new FacilityManager());
		setFacilityCapacity(new FacilityCapacity());
	}
	
	
	public void setFacilityID(String id) {
		this.facilityID = id;
	}

	
	public String getFacilityID() {
		return this.facilityID;
	}
	
	
	public void setFacilityName(String name) {
		this.name = name;
	}
		
	
	public String getFacilityName() {
		return this.name;
	}
	
	
	public void setFacilityAddress(Address ad) {
		this.address = ad;
	}
		
	
	public Address getFacilityAddress() {
		return this.address;
	}

	
	public void setFacilityManager(FacilityManager manager) {
		this.manager = manager;
	}

	
	public FacilityManager getFacilityManager() {
		return this.manager;
	}

	
	public void setFacilityCapacity(FacilityCapacity capacity) {
		this.capacity = capacity;
	}

	
	public FacilityCapacity getFacilityCapacity() {
		return this.capacity;
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
	
	public void setDaysOpen(int days) {
		this.daysOpen = days;
	}
	
	public int getDaysOpen() {
		return this.daysOpen;
	}
	
	
}
