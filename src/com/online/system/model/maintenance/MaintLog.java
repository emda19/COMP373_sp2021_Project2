package com.online.system.model.maintenance;

import java.util.ArrayList;
import java.util.Date;

// Record of all maintenance orders
public class MaintLog implements IMaintLog {

	private String maintLogID;
	private ArrayList<IMaintRequest> requestLog; //list of all maintenance requests
	private ArrayList<IMaintenance> maintSchedule; //list of all scheduled maintenance
	private int daysRunning;
	
	public MaintLog() {}
	
	public void setDaysRunning(int days) {
		this.daysRunning = days;
	}
	public int getDaysRunning() {
		return this.daysRunning;
	}

	public void setMaintLogID(String id) {
		this.maintLogID = id;
	}

	public String getMaintLogID() {
		return this.maintLogID;
	}

	public void setRequestLog(ArrayList<IMaintRequest> list) {
		this.requestLog = list;
	}

	public ArrayList<IMaintRequest> getRequestLog() {
		return this.requestLog;
	}

	public void setMaintSchedule(ArrayList<IMaintenance> list) {
		this.maintSchedule = list;
	}

	public ArrayList<IMaintenance> getMaintSchedule() {
		return this.maintSchedule;
	}

	@Override
	public IMaintRequest makeFacilityMaintRequest(String id, Date d, String des, boolean status) {
		IMaintRequest request = new MaintRequest();
		request.setRequestID(id);
		request.setDateRequested(d);
		request.setRequestDescription(des);
		request.setRequestStatus(status);
		this.requestLog.add(request);
		return request;
	}

	@Override
	public IMaintenance scheduleMaintenance(String id, IMaintCost cost, Date date) {
		IMaintenance maint = new Maintenance();
		maint.setScheduleID(id);
		maint.setMaintCost(cost);
		maint.setScheduleDate(date);
		this.maintSchedule.add(maint);
		return maint;
	}

	@Override
	public ArrayList<IMaintRequest> listMaintRequests() {
		return this.requestLog;
	}

	@Override
	public ArrayList<IMaintenance> listMaintenance() {
		return this.maintSchedule;
	}

	@Override
	public ArrayList<String> listFacilityProblems() {
		ArrayList<String> problems = new ArrayList<String>();
		for (IMaintRequest m : this.requestLog) {
			problems.add(m.getRequestDescription());
		}
		return problems;
	}

	@Override
	public float calcMaintenanceCostForFacility() {
		float totalCost = 0;
		for (IMaintenance m : this.maintSchedule) {
			totalCost += m.getMaintCost().getTotalCost();
		}
		return totalCost;
	}

	@Override
	public int calcDownTimeForFacility() {
		int daysOfMaint = this.maintSchedule.size();
		int daysOff = this.daysRunning - daysOfMaint;
		return daysOff;
	}

	@Override
	public int calcProblemRateForFacility() {
		int numProblems = this.requestLog.size();
		int problemRate = numProblems / this.daysRunning;
		return problemRate;
	}
	
}
