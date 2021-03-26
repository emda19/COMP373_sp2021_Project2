package com.online.system.model.facility;

public class FacilityCapacity {

	private int totalUnits;
	private int rentedUnits;
	
	public FacilityCapacity() {}
	
	//Set total units
	public void setNumTotalUnits(int total) {
		this.totalUnits = total;
	}
	
	//Get total units
	public int getNumTotalUnits() {
		return this.totalUnits;
	}
	
	//Set rented units
	public void setNumRentedUnits(int rented) {
		this.rentedUnits = rented;
	}
	
	public int getNumRentedUnits() {
		return this.rentedUnits;
	}
	
	public int getNumAvailableUnits() {
		return (this.totalUnits - this.rentedUnits);
	}
	
}
