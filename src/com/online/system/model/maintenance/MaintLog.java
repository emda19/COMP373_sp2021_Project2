package com.online.system.model.maintenance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* This class keeps a record of all maintenance jobs for a facility */
public class MaintLog implements IMaintLog {

	private String maintLogID;
	private ArrayList<IMaintRequest> requestLog; //list of all maintenance requests
	private ArrayList<IMaintenance> maintSchedule; //list of all scheduled maintenance
	private float daysRunning;
	
	public MaintLog() {}
	
	//Finds the number of days since maintenance first began
	public void setDaysRunning(String start, String today) {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date startDate = format.parse(start);
			Date todayDate = format.parse(today);
			long difference = todayDate.getTime() - startDate.getTime();
			this.daysRunning = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
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
	public IMaintRequest makeFacilityMaintRequest(String id, String date, String des, boolean status) {
		IMaintRequest request = new MaintRequest();
		request.setRequestID(id);
		request.setDateRequested(date);
		request.setRequestDescription(des);
		request.setRequestStatus(status);
		this.requestLog.add(request);
		return request;
	}

	//Schedule a maintenance job, add it to the log
	public IMaintenance scheduleMaintenance(String id, IMaintCost cost, String date) {
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
	public float calcDownTimeForFacility() {
		int daysOfMaint = this.maintSchedule.size();
		float daysOff = this.daysRunning - daysOfMaint;
		return daysOff;
	}

	//Return the number of problem rate of the facility
	public float calcProblemRateForFacility() {
		int numProblems = this.requestLog.size();
		float problemRate = numProblems / this.daysRunning;
		return problemRate;
	}
	
}
