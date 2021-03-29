package com.online.system.model.maintenance;

public interface IMaintenance {

	public String getScheduleID();
	public void setScheduleID(String id);
	public IMaintCost getMaintCost();
	public void setMaintCost(IMaintCost cost);
	public String getScheduleDate();
	public void setScheduleDate(String date);
	public void rescheduleMaint(String date);
	public boolean isCompleted();
	public void updateCompletionStatus(boolean b);
}
