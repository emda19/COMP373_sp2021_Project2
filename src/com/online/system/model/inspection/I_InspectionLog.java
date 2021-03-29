package com.online.system.model.inspection;

import java.util.List;

public interface I_InspectionLog {

	public void setInspectionLog(List<I_Inspection> list);
	public void addInspection(I_Inspection inspection);
	public void removeInspection(I_Inspection inspection);
	public List<I_Inspection> listInspections();
}
