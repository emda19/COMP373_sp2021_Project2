package com.online.system.model.use;

import java.util.List;

public interface IUseLog {

	public void setUsages(List<IUsage> log);
	public boolean isInUseDuringInterval(IUseInterval interval);
	public void assignFacilityToUse(IUsage use);
	public List<IUsage> vacateFacility();
	public List<IUsage> listUsages();
	public float calcUsageRate();
}
