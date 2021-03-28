package com.online.system.model.facility;

/* This class is used to keep track of the capacity of the facility */
/* Tracks the total capacity, how many units are in use, and how many units are available */
public class Capacity implements ICapacity {

	private int totalUnits;
	private int rentedUnits;
	
	public Capacity() {}
	
	//Set Total Units
	public void setNumTotalUnits(int total) {
		this.totalUnits = total;
	}
	
	//Return Total Units
	public int getNumTotalUnits() {
		return this.totalUnits;
	}
	
	//Set Number of Rented Units
	public void setNumRentedUnits(int rented) {
		this.rentedUnits = rented;
	}
	
	//Return Number of Currently Rented Units
	public int getNumRentedUnits() {
		return this.rentedUnits;
	}
	
	//Return Number of Currently Vacant Units
	public int getNumAvailableUnits() {
		return (this.totalUnits - this.rentedUnits);
	}
	
}
