package com.online.system.model.use;

import java.util.ArrayList;

public interface IUseLog {

	public void setUseLogID(String id);
	public String getUseLogID();
	public void setUseLog(ArrayList<IUsage> log);
	
	public boolean isInUseDuringInterval(IUseInterval interval);
	public IUsage assignFacilityToUse(IFacilityUser user, IUseInterval interval);
	public ArrayList<IUsage> vacateFacility();
	public ArrayList<IUsage> listActualUsage();
	public int calcUsageRate();
}
