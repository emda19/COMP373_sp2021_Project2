package com.online.system.model.facility;

import java.util.Date;

public interface IFacilityInfo {

	public void setFacilityID(String id);
	public String getFacilityID();
	public void setFacilityName(String name);
	public String getFacilityName();
	public void setFacilityAddress(IAddress ad);
	public IAddress getFacilityAddress();
	public void setFacilityManager(IFacilityManager manager);
	public IFacilityManager getFacilityManager();
	public void setCapacity(ICapacity capacity);
	public ICapacity getCapacity();
	public void setDateOpened(Date date);
	public Date getDateOpened();
}
