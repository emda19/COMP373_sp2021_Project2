package com.online.system.model.maintenance;

import java.util.ArrayList;
import java.util.Date;

public interface IMaintLog {
	
	public void setDaysRunning(int days);
	public int getDaysRunning();
	public void setMaintLogID(String id);
	public String getMaintLogID();
	public void setRequestLog(ArrayList<IMaintRequest> list);
	public ArrayList<IMaintRequest> getRequestLog();
	public void setMaintSchedule(ArrayList<IMaintenance> list);
	public ArrayList<IMaintenance> getMaintSchedule();
	
	public IMaintRequest makeFacilityMaintRequest(String id, Date d, String des, boolean status);
	public IMaintenance scheduleMaintenance(String id, IMaintCost cost, Date date);
	public ArrayList<IMaintRequest> listMaintRequests();
	public ArrayList<IMaintenance> listMaintenance();
	public ArrayList<String> listFacilityProblems();
	public float calcMaintenanceCostForFacility();
	public int calcProblemRateForFacility();
	public int calcDownTimeForFacility();
	
}
