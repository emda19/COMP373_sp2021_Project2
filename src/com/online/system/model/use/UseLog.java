package com.online.system.model.use;

import java.util.ArrayList;
import java.util.List;

/* This class records all usages of a facility */
public class UseLog implements IUseLog {
	
	private List<IUsage> useLog;
	
	public UseLog() {}

	//Assign a usage log
	public void setUseLog(List<IUsage> log) {
		this.useLog = log;
	}

	//Return true if the facility is in use during a given interval, return false if not in use
	public boolean isInUseDuringInterval(IUseInterval interval) {
		List<IUseInterval> usageDates = new ArrayList<IUseInterval>();
		for (IUsage u : this.useLog) {
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
		this.useLog.add(use);
		return use;
	}

	//Clears all usages of the facility
	public List<IUsage> vacateFacility() {
		this.useLog.clear();
		return this.useLog;
	}

	//Returns a list of all usages of the facility
	public List<IUsage> listActualUsage() {
		return this.useLog;
	}

	//Returns the usage rate of the facility
	public float calcUsageRate() {
		int usages = this.useLog.size();
		int days = 0;
		for (IUsage u : this.useLog) {
			days += u.getUseInterval().getDaysUsed();
		}
		float rate = usages / days;
		return rate;
	}
	
}
