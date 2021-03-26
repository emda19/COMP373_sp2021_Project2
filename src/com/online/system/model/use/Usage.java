package com.online.system.model.use;

public class Usage {

	private FacilityUser user;
	private UseInterval useInterval;
	private int daysUsed;
	
	public Usage(FacilityUser u, UseInterval i) {
		this.user = u;
		this.useInterval = i;
	}
	
	public void setUser(FacilityUser user) {
		this.user = user;
	}
	
	public FacilityUser getUser() {
		return this.user;
	}
	
	public void setUseInterval(UseInterval i) {
		this.useInterval = i;
	}
	
	public UseInterval getUseInterval() {
		return this.useInterval;
	}
	
	public void setDaysUsed(int daysUsed) {
		this.daysUsed = daysUsed;
	}
	
	public int getDaysUsed() {
		return this.daysUsed;
	}
}
