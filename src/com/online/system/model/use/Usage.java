package com.online.system.model.use;

/* This class holds information for each usage of a facility */
public class Usage implements IUsage {

	private IFacilityUser user;
	private IUseInterval useInterval;
	private int daysUsed;
	
	public Usage() {}
	
	//Set the facility user
	public void setUser(IFacilityUser user) {
		this.user = user;
	}
	
	//Return the facility user
	public IFacilityUser getUser() {
		return this.user;
	}
	
	//Set the date interval of this usage
	public void setUseInterval(IUseInterval i) {
		this.useInterval = i;
	}
	
	//Return the date interval of this usage
	public IUseInterval getUseInterval() {
		return this.useInterval;
	}
	
	//Set the number of days of this usage
	public void setDaysUsed(int daysUsed) {
		this.daysUsed = daysUsed;
	}
	
	//Return the number of days of this usage
	public int getDaysUsed() {
		return this.daysUsed;
	}
}
