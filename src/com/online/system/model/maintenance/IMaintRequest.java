package com.online.system.model.maintenance;

import java.util.Date;

public interface IMaintRequest {

	public String getRequestID();
	public void setRequestID(String requestID);
	public Date getDateRequested();
	public void setDateRequested(Date dateRequested);
	public String getRequestDescription();
	public void setRequestDescription(String requestDescription);
	public boolean getRequestStatus();
	public void setRequestStatus(boolean status);
}
