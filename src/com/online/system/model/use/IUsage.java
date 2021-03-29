package com.online.system.model.use;

public interface IUsage {

	public void setFacilityUser(IFacilityUser user);
	public IFacilityUser getFacilityUser();
	public void setUseInterval(IUseInterval i);
	public IUseInterval getUseInterval();
}
