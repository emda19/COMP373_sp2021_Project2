package com.online.system.model.use;

import java.util.ArrayList;

/* This class records all usages of a facility */
public class UseLog implements IUseLog {
	
	private String useLogID;
	private ArrayList<IUsage> useLog;
	
	public UseLog() {}

	//Set the log's ID number
	public void setUseLogID(String id) {
		this.useLogID = id;
	}

	//Return the log's ID number
	public String getUseLogID() {
		return this.useLogID;
	}

	//Assign a usage log
	public void setUseLog(ArrayList<IUsage> log) {
		this.useLog = log;
	}

	//Return true if the facility is in use during a given interval, return false if not in use
	public boolean isInUseDuringInterval(IUseInterval interval) {
		ArrayList<IUseInterval> usageDates = new ArrayList<IUseInterval>();
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
	public IUsage assignFacilityToUse(IFacilityUser user, IUseInterval interval) {
		IUsage use = new Usage();
		use.setUser(user);
		use.setUseInterval(interval);
		this.useLog.add(use);
		return use;
	}

	//Clears all usages of the facility
	public ArrayList<IUsage> vacateFacility() {
		this.useLog.clear();
		return this.useLog;
	}

	//Returns a list of all usages of the facility
	public ArrayList<IUsage> listActualUsage() {
		return this.useLog;
	}

	//Returns the usage rate of the facility
	public int calcUsageRate() {
		int usages = this.useLog.size();
		int days = 0;
		for (IUsage u : this.useLog) {
			days += u.getDaysUsed();
		}
		int rate = usages / days;
		return rate;
	}
	
}
