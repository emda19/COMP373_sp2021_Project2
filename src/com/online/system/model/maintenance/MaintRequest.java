package com.online.system.model.maintenance;

import java.util.Date;

/* This class is used to hold information for a maintenance request submitted to the facility */
public class MaintRequest implements IMaintRequest {
     	
	private String requestID;
	private Date dateRequested;
	private String requestDescription;
	private boolean requestStatus; //true = open, false = closed (thrown out, or maintenance was scheduled)
	
	public MaintRequest() {}
	
	/* non-default constructor
	public MaintRequest(String id, Date d, String desc, boolean status) {
		this.requestID = id;
		this.dateRequested = d;
		this.requestDescription = desc;
		this.requestStatus = status;
	}*/
	
	//Return request ID number
	public String getRequestID() {
		return this.requestID;
	}
	
	//Set request ID number
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	
	//Return the submission date of the request
	public Date getDateRequested() {
		return this.dateRequested;
	}
	
	//Set the submission date of the request
	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}
	
	//Return the request description
	public String getRequestDescription() {
		return this.requestDescription;
	}
	
	//Set the request description
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	
	//Return the request status
	public boolean getRequestStatus() {
		return this.requestStatus;
	}
	
	//Set the request status
	public void setRequestStatus(boolean status) {
		this.requestStatus = status;
	}

}
