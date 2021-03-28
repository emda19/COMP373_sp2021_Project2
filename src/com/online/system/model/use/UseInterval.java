package com.online.system.model.use;

import java.util.Date;

/* This class marks a start and end date for facility usages */
public class UseInterval implements IUseInterval {

	private Date startDate;
	private Date endDate;
	
	public UseInterval() {}
	
	//Return the start date
	public Date getStartDate() {
		return this.startDate;
	}
	
	//Set the start date
	public void setStartDate(Date d) {
		this.startDate = d;
	}
	
	//Return the end date
	public Date getEndDate() {
		return this.endDate;
	}
	
	//Set the end date
	public void setEndDate(Date d) {
		this.endDate = d;
	}
	
	/*
	public String toString() {
		String start = startDate.toString();
		String end = endDate.toString();
		return start + " - " + end;
	}
	*/
}
