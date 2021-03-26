package com.online.system.model.inspection;

import java.util.ArrayList;

public class InspectionLog implements I_Inspection {

	private ArrayList<Inspection> inspectionLog;
	
	public InspectionLog() {
		this.inspectionLog = new ArrayList<Inspection>();
	}

	public void setInspectionLog(ArrayList<Inspection> list) {
		this.inspectionLog = list;
	}
	

	@Override
	public ArrayList<Inspection> listInspections() {
		return this.inspectionLog;
	}

}
