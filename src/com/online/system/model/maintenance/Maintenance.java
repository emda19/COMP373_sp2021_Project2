package com.online.system.model.maintenance;

import java.util.Date;

// Schedule of future maintenance requests
public class Maintenance implements IMaintenance {
    
	private String scheduleID;
    private IMaintCost cost;
    private Date scheduleDate;
    boolean completed = false;
    
    public Maintenance() {}
    
    /* non-default constructor
    public Maintenance(String id, MaintCost cost, Date date) {
    	this.scheduleID = id;
    	this.cost = cost;
    	this.scheduleDate = date;
    	this.completed = false;
    }*/
    
    //Get schedule ID
    public String getScheduleID() {
    	return this.scheduleID;
    }
    
    //Set schedule ID
    public void setScheduleID(String id) {
    	this.scheduleID = id;
    }
    
    //Get cost
    public IMaintCost getMaintCost() {
    	return this.cost;
    }
    
    //Set cost
    public void setMaintCost(IMaintCost cost) {
    	this.cost = cost;
    }
    
    //Get schedule date
	public Date getScheduleDate() {
		return this.scheduleDate;
	}
	
	//Set schedule date
	public void setScheduleDate(Date date) {
		this.scheduleDate = date;
	}
	
	//Reschedule maintenance
	public void rescheduleMaint(Date date) {
		this.scheduleDate = date;
	}
	
	//Get completion status
	public boolean isCompleted() {
		return this.completed;
	}
	
	//Update completion status
	public void updateCompletionStatus(boolean b) {
		this.completed = b;
	}
}
