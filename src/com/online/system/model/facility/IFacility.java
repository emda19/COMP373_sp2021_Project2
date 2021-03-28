package com.online.system.model.facility;

import java.util.Date;

public interface IFacility {

	public void setFacilityInfo(IFacilityInfo info);
	public IFacilityInfo getFacilityInformation();
	public int requestAvailableCapacity();
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager, ICapacity capacity, Date date);
	
}
