package com.online.system.model.maintenance;

import java.util.Date;

// Schedule of future maintenance requests
public class Maintenance {
    
	private String scheduleID;
    private MaintCost cost;
    private Date scheduleDate;
    boolean completed;
    
    public Maintenance(String id, MaintCost cost, Date date) {
    	this.scheduleID = id;
    	this.cost = cost;
    	this.scheduleDate = date;
    	this.completed = false;
    }
    
    //Get schedule ID
    public String getScheduleID() {
    	return this.scheduleID;
    }
    
    //Get cost
    public MaintCost getMaintCost() {
    	return this.cost;
    }
    
    //Get schedule date
	public Date getScheduleDate() {
		return this.scheduleDate;
	}
	
	//Reschedule maintenance
	public void rescheduleMaint(Date d) {
		this.scheduleDate = d;
	}
	
	//Get status
	public boolean isCompleted() {
		return this.completed;
	}
	
	//Update status
	public void updateCompletionStatus(boolean b) {
		this.completed = b;
	}
}
