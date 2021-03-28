package com.online.system.model.facility;

public interface ICapacity {

	public void setNumTotalUnits(int total);
	public int getNumTotalUnits();
	public void setNumRentedUnits(int rented);
	public int getNumRentedUnits();
	public int getNumAvailableUnits();
}
