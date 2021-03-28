package com.online.system.model.maintenance;

import java.util.Date;

/* This class is used to hold information of scheduled maintenance for a facility */
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
    
    //Return the scheduled maintenance ID number
    public String getScheduleID() {
    	return this.scheduleID;
    }
    
    //Set the scheduled maintenance ID number
    public void setScheduleID(String id) {
    	this.scheduleID = id;
    }
    
    //Return the cost of the maintenance job
    public IMaintCost getMaintCost() {
    	return this.cost;
    }
    
    //Set the cost of the maintenance job
    public void setMaintCost(IMaintCost cost) {
    	this.cost = cost;
    }
    
    //Return the date the maintenance is scheduled for
	public Date getScheduleDate() {
		return this.scheduleDate;
	}
	
	//Set the date the maintenance is scheduled for
	public void setScheduleDate(Date date) {
		this.scheduleDate = date;
	}
	
	//Reschedule the maintenance job
	public void rescheduleMaint(Date date) {
		this.scheduleDate = date;
	}
	
	//Return the completion status of the maintenance job
	public boolean isCompleted() {
		return this.completed;
	}
	
	//Update the completion status of the maintenance job
	public void updateCompletionStatus(boolean b) {
		this.completed = b;
	}
}
