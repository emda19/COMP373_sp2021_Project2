package com.online.system.model.use;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* This class marks a start and end date for facility usages */
public class UseInterval implements IUseInterval {

	private String startDate;
	private String endDate;
	private long numDaysInUse;
	
	public UseInterval() {}
	
	//Return the number of days in the interval
	public long getDaysUsed() {
		return this.numDaysInUse;
	}
	//Calculates the number of days in the interval
	public void setDaysUsed() {
		if (this.startDate==null) {
			System.out.println("Error: no start date exists");
		}
		if (this.endDate==null) {
			System.out.println("Error: no end date exists");
		}
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date start = format.parse(this.startDate);
			Date end = format.parse(this.endDate);
			long difference = end.getTime() - start.getTime();
			this.numDaysInUse = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
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
