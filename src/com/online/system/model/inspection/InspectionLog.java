package com.online.system.model.inspection;

import java.util.List;

/* This class is used to keep track of all facility inspections */
public class InspectionLog implements I_InspectionLog {

	private List<I_Inspection> inspectionLog;
	
	public InspectionLog() {}

	//Set the inspection log
	public void setInspectionLog(List<I_Inspection> list) {
		this.inspectionLog = list;
	}
	
	//Add an inspection to the log
	public void addInspection(I_Inspection inspection) {
		this.inspectionLog.add(inspection);
	}
	
	//Remove an inspection from the log
	public void removeInspection(I_Inspection inspection) {
		this.inspectionLog.remove(inspection);
	}
	
	//Return the list of all inspections for a facility
	public List<I_Inspection> listInspections() {
		return this.inspectionLog;
	}

}
