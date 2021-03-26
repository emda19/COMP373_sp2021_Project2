package com.online.system.model.maintenance;

import java.util.ArrayList;
import java.util.Date;

// Record of all maintenance orders
public class MaintLog implements IMaintenance {

	private String maintLogID;
	private ArrayList<MaintRequest> requestLog; //list of all maintenance requests
	private ArrayList<Maintenance> maintSchedule; //list of all scheduled maintenance
	private int daysRunning;
	
	public MaintLog() {
		this.requestLog = new ArrayList<MaintRequest>();
		this.maintSchedule = new ArrayList<Maintenance>();
	}
	
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

	public void setRequestLog(ArrayList<MaintRequest> list) {
		this.requestLog = list;
	}

	public ArrayList<MaintRequest> getRequestLog() {
		return this.requestLog;
	}

	public void setMaintSchedule(ArrayList<Maintenance> list) {
		this.maintSchedule = list;
	}

	public ArrayList<Maintenance> getMaintSchedule() {
		return this.maintSchedule;
	}

	@Override
	public MaintRequest makeFacilityMaintRequest(String id, Date d, String des, boolean status) {
		MaintRequest request = new MaintRequest(id, d, des, status);
		this.requestLog.add(request);
		return request;
	}

	@Override
	public Maintenance scheduleMaintenance(String id, MaintCost cost, Date date) {
		Maintenance m = new Maintenance(id, cost, date);
		this.maintSchedule.add(m);
		return m;
	}

	@Override
	public ArrayList<MaintRequest> listMaintRequests() {
		return this.requestLog;
	}

	@Override
	public ArrayList<Maintenance> listMaintenance() {
		return this.maintSchedule;
	}

	@Override
	public ArrayList<String> listFacilityProblems() {
		ArrayList<String> problems = new ArrayList<String>();
		for (MaintRequest m : this.requestLog) {
			problems.add(m.getRequestDescription());
		}
		return problems;
	}

	@Override
	public float calcMaintenanceCostForFacility() {
		float totalCost = 0;
		for (Maintenance m : this.maintSchedule) {
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
