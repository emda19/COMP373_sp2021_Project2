package com.online.system.model.maintenance;

import java.util.ArrayList;

public interface IMaintLog {
	
	public void setDaysRunning(String start, String today);
	public void setMaintLogID(String id);
	public String getMaintLogID();
	public void setRequestLog(ArrayList<IMaintRequest> list);
	public ArrayList<IMaintRequest> getRequestLog();
	public void setMaintSchedule(ArrayList<IMaintenance> list);
	public ArrayList<IMaintenance> getMaintSchedule();
	
	public IMaintRequest makeFacilityMaintRequest(String id, String date, String des, boolean status);
	public IMaintenance scheduleMaintenance(String id, IMaintCost cost, String date);
	public ArrayList<IMaintRequest> listMaintRequests();
	public ArrayList<IMaintenance> listMaintenance();
	public ArrayList<String> listFacilityProblems();
	public float calcMaintenanceCostForFacility();
	public float calcProblemRateForFacility();
	public float calcDownTimeForFacility();
	
}
