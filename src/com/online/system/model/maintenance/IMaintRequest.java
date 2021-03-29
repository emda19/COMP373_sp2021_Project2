package com.online.system.model.maintenance;

public interface IMaintRequest {

	public String getRequestID();
	public void setRequestID(String requestID);
	public String getDateRequested();
	public void setDateRequested(String dateRequested);
	public String getRequestDescription();
	public void setRequestDescription(String requestDescription);
	public boolean getRequestStatus();
	public void setRequestStatus(boolean status);
}
