package com.online.system.model.use;

import java.util.ArrayList;

public class UseLog implements IUse {
	
	private String useLogID;
	private ArrayList<Usage> useLog;
	
	public UseLog() {
		this.useLog = new ArrayList<Usage>();
	}

	public void setUseLogID(String id) {
		this.useLogID = id;
	}

	public String getUseLogID() {
		return this.useLogID;
	}

	public void setUseLog(ArrayList<Usage> map) {
		this.useLog = map;
	}

	@Override
	public boolean isInUseDuringInterval(UseInterval interval) {
		ArrayList<UseInterval> usageDates = new ArrayList<UseInterval>();
		for (Usage u : this.useLog) {
			usageDates.add(u.getUseInterval());
		}
		if (usageDates.contains(interval)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Usage assignFacilityToUse(FacilityUser user, UseInterval interval) {
		Usage use = new Usage(user, interval);
		this.useLog.add(use);
		return use;
	}

	@Override
	public ArrayList<Usage> vacateFacility() {
		this.useLog.clear();
		return this.useLog;
	}

	@Override
	public ArrayList<Usage> listActualUsage() {
		return this.useLog;
	}

	@Override
	public int calcUsageRate() {
		int usages = this.useLog.size();
		int days = 0;
		for (Usage u : this.useLog) {
			days += u.getDaysUsed();
		}
		int rate = usages / days;
		return rate;
	}
	
}
