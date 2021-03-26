package com.online.system.model.maintenance;

import java.util.ArrayList;
import java.util.Date;

public interface IMaintenance {

	public MaintRequest makeFacilityMaintRequest(String id, Date d, String des, boolean status);
	public Maintenance scheduleMaintenance(String id, MaintCost cost, Date date);
	public ArrayList<MaintRequest> listMaintRequests();
	public ArrayList<Maintenance> listMaintenance();
	public ArrayList<String> listFacilityProblems();
	public float calcMaintenanceCostForFacility();
	public int calcProblemRateForFacility();
	public int calcDownTimeForFacility();
	
}
