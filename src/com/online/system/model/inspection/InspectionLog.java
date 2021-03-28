package com.online.system.model.inspection;

import java.util.ArrayList;

public class InspectionLog implements I_InspectionLog {

	private ArrayList<I_Inspection> inspectionLog;
	
	public InspectionLog() {
		this.inspectionLog = new ArrayList<I_Inspection>();
	}

	public void setInspectionLog(ArrayList<I_Inspection> list) {
		this.inspectionLog = list;
	}
	

	@Override
	public ArrayList<I_Inspection> listInspections() {
		return this.inspectionLog;
	}

}
