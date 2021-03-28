package com.online.system.model.facility;

public class FacilityInfo implements IFacilityInfo {

	private String facilityID;
	private String name;
	private IAddress address;
	private IFacilityManager manager;
	private ICapacity capacity;
	private int daysOpen;
	
	public FacilityInfo() {}
	
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
	
	
	public void setFacilityAddress(IAddress ad) {
		this.address = ad;
	}
		
	
	public IAddress getFacilityAddress() {
		return this.address;
	}

	
	public void setFacilityManager(IFacilityManager manager) {
		this.manager = manager;
	}

	
	public IFacilityManager getFacilityManager() {
		return this.manager;
	}

	
	public void setCapacity(ICapacity capacity) {
		this.capacity = capacity;
	}

	
	public ICapacity getCapacity() {
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
