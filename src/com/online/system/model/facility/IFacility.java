package com.online.system.model.facility;

public interface IFacility {

	public void setFacilityInfo(IFacilityInfo info);
	public IFacilityInfo getFacilityInformation();
	public int requestAvailableCapacity();
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager, ICapacity capacity, String date);
	
}
