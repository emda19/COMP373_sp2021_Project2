package com.online.system.model.maintenance;

import java.util.ArrayList;
import java.util.Date;

/* This class keeps a record of all maintenance jobs for a facility */
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

	//Set the maintenance log ID number
	public void setMaintLogID(String id) {
		this.maintLogID = id;
	}

	//Return the maintenance log ID number
	public String getMaintLogID() {
		return this.maintLogID;
	}

	//Set a log of requests to the maintenance log
	public void setRequestLog(ArrayList<IMaintRequest> list) {
		this.requestLog = list;
	}

	//Return the log of requests
	public ArrayList<IMaintRequest> getRequestLog() {
		return this.requestLog;
	}

	//Set a list of scheduled maintenance to the log
	public void setMaintSchedule(ArrayList<IMaintenance> list) {
		this.maintSchedule = list;
	}

	//Return the list of scheduled maintenance
	public ArrayList<IMaintenance> getMaintSchedule() {
		return this.maintSchedule;
	}

	//Submit a maintenance request for the facility, add it to the log
	public IMaintRequest makeFacilityMaintRequest(String id, Date d, String des, boolean status) {
		IMaintRequest request = new MaintRequest();
		request.setRequestID(id);
		request.setDateRequested(d);
		request.setRequestDescription(des);
		request.setRequestStatus(status);
		this.requestLog.add(request);
		return request;
	}

	//Schedule a maintenance job, add it to the log
	public IMaintenance scheduleMaintenance(String id, IMaintCost cost, Date date) {
		IMaintenance maint = new Maintenance();
		maint.setScheduleID(id);
		maint.setMaintCost(cost);
		maint.setScheduleDate(date);
		this.maintSchedule.add(maint);
		return maint;
	}

	//Return a list of all maintenance requests
	public ArrayList<IMaintRequest> listMaintRequests() {
		return this.requestLog;
	}

	//Return a list of all scheduled maintenance jobs
	public ArrayList<IMaintenance> listMaintenance() {
		return this.maintSchedule;
	}

	//Return a list of the facility's problems (descriptions of requests and jobs)
	public ArrayList<String> listFacilityProblems() {
		ArrayList<String> problems = new ArrayList<String>();
		for (IMaintRequest m : this.requestLog) {
			problems.add(m.getRequestDescription());
		}
		return problems;
	}

	//Return the total cost of all maintenance jobs
	public float calcMaintenanceCostForFacility() {
		float totalCost = 0;
		for (IMaintenance m : this.maintSchedule) {
			totalCost += m.getMaintCost().getTotalCost();
		}
		return totalCost;
	}

	//Return the number of days where no maintenance jobs took place
	public int calcDownTimeForFacility() {
		int daysOfMaint = this.maintSchedule.size();
		int daysOff = this.daysRunning - daysOfMaint;
		return daysOff;
	}

	//Return the number of problem rate of the facility
	public int calcProblemRateForFacility() {
		int numProblems = this.requestLog.size();
		int problemRate = numProblems / this.daysRunning;
		return problemRate;
	}
	
}
