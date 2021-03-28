package com.online.system.model.inspection;

import java.util.ArrayList;

/* This class is used to keep track of all facility inspections */
public class InspectionLog implements I_InspectionLog {

	private ArrayList<I_Inspection> inspectionLog;
	
	public InspectionLog() {}

	//Set the inspection log
	public void setInspectionLog(ArrayList<I_Inspection> list) {
		this.inspectionLog = list;
	}
	
	//Return the list of all inspections for a facility
	public ArrayList<I_Inspection> listInspections() {
		return this.inspectionLog;
	}

}
