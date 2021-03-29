package com.online.system.model.use;

import java.util.List;

public interface IUseLog {

	public void setUseLog(List<IUsage> log);
	
	public boolean isInUseDuringInterval(IUseInterval interval);
	public IUsage assignFacilityToUse(IUsage use);
	public List<IUsage> vacateFacility();
	public List<IUsage> listActualUsage();
	public float calcUsageRate();
}
