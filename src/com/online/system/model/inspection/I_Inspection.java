package com.online.system.model.inspection;

import java.util.Date;

public interface I_Inspection {

	public void setInspectionID(String id);
	public String getInspectionID();
	public void setInspectionDate(Date d);
	public Date getInspectionDate();
	public void setInspectionDescription(String s);
	public String getInspectionDescription();
	public void setInspectionOutcome(String s);
	public String getInspectionOutcome();
}
