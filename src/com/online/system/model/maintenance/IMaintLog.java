package com.online.system.model.maintenance;

import java.util.List;

public interface IMaintLog {
	
	public void setDaysRunning(String start, String today);
	public void setRequests(List<IMaintRequest> list);
	public void setMaintSchedule(List<IMaintenance> list);
	
	public IMaintRequest makeFacilityMaintRequest(IMaintRequest request);
	public IMaintenance scheduleMaintenance(IMaintenance maint);
	public List<IMaintRequest> listRequests();
	public List<IMaintenance> listMaintenance();
	public List<String> listFacilityProblems();
	public double calcMaintenanceCostForFacility();
	public float calcProblemRateForFacility();
	public float calcDownTimeForFacility();
	
}
