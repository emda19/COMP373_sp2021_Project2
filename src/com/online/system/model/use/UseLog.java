package com.online.system.model.use;

import java.util.ArrayList;

public class UseLog implements IUseLog {
	
	private String useLogID;
	private ArrayList<IUsage> useLog;
	
	public UseLog() {}

	public void setUseLogID(String id) {
		this.useLogID = id;
	}

	public String getUseLogID() {
		return this.useLogID;
	}

	public void setUseLog(ArrayList<IUsage> log) {
		this.useLog = log;
	}

	@Override
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

	@Override
	public IUsage assignFacilityToUse(IFacilityUser user, IUseInterval interval) {
		IUsage use = new Usage();
		use.setUser(user);
		use.setUseInterval(interval);
		this.useLog.add(use);
		return use;
	}

	@Override
	public ArrayList<IUsage> vacateFacility() {
		this.useLog.clear();
		return this.useLog;
	}

	@Override
	public ArrayList<IUsage> listActualUsage() {
		return this.useLog;
	}

	@Override
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
