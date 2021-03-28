package com.online.system.model.use;

import java.util.Date;

public class UseInterval implements IUseInterval {

	private Date startDate;
	private Date endDate;
	
	public UseInterval() {}
	
	//Get start date
	public Date getStartDate() {
		return this.startDate;
	}
	
	//Change start date
	public void setStartDate(Date d) {
		this.startDate = d;
	}
	
	//Get end date
	public Date getEndDate() {
		return this.endDate;
	}
	
	//Change end date
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
