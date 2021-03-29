package com.online.system.model.use;

/* This class marks a start and end date for facility usages */
public class UseInterval implements IUseInterval {

	private String startDate;
	private String endDate;
	
	public UseInterval() {}
	
	//Return the start date
	public String getStartDate() {
		return this.startDate;
	}
	
	//Set the start date
	public void setStartDate(String date) {
		this.startDate = date;
	}
	
	//Return the end date
	public String getEndDate() {
		return this.endDate;
	}
	
	//Set the end date
	public void setEndDate(String date) {
		this.endDate = date;
	}
	
	/*
	public String toString() {
		String start = startDate.toString();
		String end = endDate.toString();
		return start + " - " + end;
	}
	*/
}
