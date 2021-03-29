package com.online.system.model.use;

import java.util.ArrayList;
import java.util.List;

/* This class records all usages of a facility */
public class UseLog implements IUseLog {
	
	private List<IUsage> usages;
	
	public UseLog() {}

	//Assign a usage log
	public void setUsages(List<IUsage> log) {
		this.usages = log;
	}

	//Return true if the facility is in use during a given interval, return false if not in use
	public boolean isInUseDuringInterval(IUseInterval interval) {
		List<IUseInterval> usageDates = new ArrayList<IUseInterval>();
		for (IUsage u : this.usages) {
			usageDates.add(u.getUseInterval());
		}
		if (usageDates.contains(interval)) {
			return true;
		} else {
			return false;
		}
	}

	//Assigns a facility for use to a given user for a given time interval
	public IUsage assignFacilityToUse(IUsage use) {
		this.usages.add(use);
		return use;
	}

	//Clears all usages of the facility
	public List<IUsage> vacateFacility() {
		this.usages.clear();
		return this.usages;
	}

	//Returns a list of all usages of the facility
	public List<IUsage> listUsages() { //listActualUsage()
		return this.usages;
	}

	//Returns the usage rate of the facility
	public float calcUsageRate() {
		int uses = this.usages.size();
		int days = 0;
		for (IUsage u : this.usages) {
			days += u.getUseInterval().getDaysUsed();
		}
		float rate = uses / days;
		return rate;
	}
	
}
