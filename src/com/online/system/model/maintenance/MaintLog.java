package com.online.system.model.maintenance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* This class keeps a record of all maintenance jobs for a facility */
public class MaintLog implements IMaintLog {

	private List<IMaintRequest> requests; //list of all maintenance requests
	private List<IMaintenance> maintSchedule; //list of all scheduled maintenance
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

	//Set a log of requests to the maintenance log
	public void setRequests(List<IMaintRequest> list) {
		this.requests = list;
	}

	//Set a list of scheduled maintenance to the log
	public void setMaintSchedule(List<IMaintenance> list) {
		this.maintSchedule = list;
	}

	//Submit a maintenance request for the facility, add it to the log
	public IMaintRequest makeFacilityMaintRequest(IMaintRequest request) {
		this.requests.add(request);
		return request;
	}

	//Schedule a maintenance job, add it to the log
	public IMaintenance scheduleMaintenance(IMaintenance maint) {
		this.maintSchedule.add(maint);
		return maint;
	}

	//Return a list of all maintenance requests
	public List<IMaintRequest> listRequests() {
		return this.requests;
	}

	//Return a list of all scheduled maintenance jobs
	public List<IMaintenance> listMaintenance() {
		return this.maintSchedule;
	}

	//Return a list of the facility's problems (descriptions of requests and jobs)
	public List<String> listFacilityProblems() {
		List<String> problems = new ArrayList<String>();
		for (IMaintRequest m : this.requests) {
			problems.add(m.getRequestDescription());
		}
		return problems;
	}

	//Return the total cost of all maintenance jobs
	public double calcMaintenanceCostForFacility() {
		double totalCost = 0;
		for (IMaintenance m : this.maintSchedule) {
			totalCost += m.getMaintCost().findTotalCost();
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
		int numProblems = this.requests.size();
		float problemRate = numProblems / this.daysRunning;
		return problemRate;
	}
	
}
