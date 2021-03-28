package com.online.system.model.maintenance;

import java.util.Date;

public interface IMaintenance {

	public String getScheduleID();
	public void setScheduleID(String id);
	public IMaintCost getMaintCost();
	public void setMaintCost(IMaintCost cost);
	public Date getScheduleDate();
	public void setScheduleDate(Date date);
	public void rescheduleMaint(Date date);
	public boolean isCompleted();
	public void updateCompletionStatus(boolean b);
}
