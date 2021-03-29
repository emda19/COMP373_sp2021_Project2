package com.online.system.model.inspection;

import java.util.List;

/* This class is used to keep track of all facility inspections */
public class InspectionLog implements I_InspectionLog {

	private List<I_Inspection> inspections;
	
	public InspectionLog() {}

	//Set the inspection log
	public void setInspections(List<I_Inspection> list) {
		this.inspections = list;
	}
	
	//Add an inspection to the log
	public void addInspection(I_Inspection inspection) {
		this.inspections.add(inspection);
	}
	
	//Remove an inspection from the log
	public void removeInspection(I_Inspection inspection) {
		this.inspections.remove(inspection);
	}
	
	//Return the list of all inspections for a facility
	public List<I_Inspection> listInspections() {
		return this.inspections;
	}

}
