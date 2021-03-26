package com.online.system.model.maintenance;

import java.util.Date;

public class MaintRequest {
     	
	private String requestID;
	private Date dateRequested;
	private String requestDescription;
	private boolean requestStatus; //true = open, false = closed (thrown out, or order was made)
	   
	public MaintRequest(String id, Date d, String desc, boolean status) {
		this.requestID = id;
		this.dateRequested = d;
		this.requestDescription = desc;
		this.requestStatus = status;
	}
	
	//Get request ID
	public String getRequestID() {
		return this.requestID;
	}
	
	//Set request ID
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	
	//Get date requested
	public Date getDateRequested() {
		return this.dateRequested;
	}
	
	//Set date required
	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}
	
	//Get request description
	public String getRequestDescription() {
		return this.requestDescription;
	}
	
	//Set request description
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	
	//Get request status
	public boolean getRequestStatus() {
		return this.requestStatus;
	}
	
	//Set request status
	public void setRequestStatus(boolean status) {
		this.requestStatus = status;
	}

}
