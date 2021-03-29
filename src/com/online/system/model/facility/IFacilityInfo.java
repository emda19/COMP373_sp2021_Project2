package com.online.system.model.facility;

public interface IFacilityInfo {

	public void setFacilityID(String id);
	public String getFacilityID();
	public void setFacilityName(String name);
	public String getFacilityName();
	public void setAddress(IAddress ad);
	public IAddress getAddress();
	public void setFacilityManager(IFacilityManager manager);
	public IFacilityManager getFacilityManager();
	public void setCapacity(ICapacity capacity);
	public ICapacity getCapacity();
	public void setDateOpened(String date);
	public String getDateOpened();
}
