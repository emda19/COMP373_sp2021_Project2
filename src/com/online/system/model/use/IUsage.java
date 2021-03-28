package com.online.system.model.use;

public interface IUsage {

	public void setUser(IFacilityUser user);
	public IFacilityUser getUser();
	public void setUseInterval(IUseInterval i);
	public IUseInterval getUseInterval();
	public void setDaysUsed(int daysUsed);
	public int getDaysUsed();
}
