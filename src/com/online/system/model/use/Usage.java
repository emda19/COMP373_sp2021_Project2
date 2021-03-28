package com.online.system.model.use;

public class Usage implements IUsage {

	private IFacilityUser user;
	private IUseInterval useInterval;
	private int daysUsed;
	
	public Usage() {}
	
	public void setUser(IFacilityUser user) {
		this.user = user;
	}
	
	public IFacilityUser getUser() {
		return this.user;
	}
	
	public void setUseInterval(IUseInterval i) {
		this.useInterval = i;
	}
	
	public IUseInterval getUseInterval() {
		return this.useInterval;
	}
	
	public void setDaysUsed(int daysUsed) {
		this.daysUsed = daysUsed;
	}
	
	public int getDaysUsed() {
		return this.daysUsed;
	}
}
