package com.online.system.model.facility;

public class Capacity implements ICapacity {

	private int totalUnits;
	private int rentedUnits;
	
	public Capacity() {}
	
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
	
	//Get number of units rented
	public int getNumRentedUnits() {
		return this.rentedUnits;
	}
	
	//Get number of vacant units
	public int getNumAvailableUnits() {
		return (this.totalUnits - this.rentedUnits);
	}
	
}
