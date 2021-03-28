package com.online.system.model.facility;

public interface IFacilityManager {

	public String getManagerID();
	public void setManagerID(String id);
	public String getFirstName();
	public void setFirstName(String first);
	public String getLastName();
	public void setLastName(String last);
	public IPhone getPhoneNumber();
	public void setPhoneNumber(IPhone number);
}
