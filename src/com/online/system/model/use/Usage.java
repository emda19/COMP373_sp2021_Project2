package com.online.system.model.use;

/* This class holds information for each usage of a facility */
public class Usage implements IUsage {

	private IFacilityUser facilityUser;
	private IUseInterval useInterval;
	
	public Usage() {}
	
	//Set the facility user
	public void setFacilityUser(IFacilityUser user) {
		this.facilityUser = user;
	}
	
	//Return the facility user
	public IFacilityUser getFacilityUser() {
		return this.facilityUser;
	}
	
	//Set the date interval of this usage
	public void setUseInterval(IUseInterval i) {
		this.useInterval = i;
	}
	
	//Return the date interval of this usage
	public IUseInterval getUseInterval() {
		return this.useInterval;
	}
}
