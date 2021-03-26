package com.online.system.model.use;

import java.util.ArrayList;

public interface IUse {

	public boolean isInUseDuringInterval(UseInterval interval);
	public Usage assignFacilityToUse(FacilityUser user, UseInterval interval);
	public ArrayList<Usage> vacateFacility();
	public ArrayList<Usage> listActualUsage();
	public int calcUsageRate();
}
