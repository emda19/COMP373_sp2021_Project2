package com.online.system.model.facility;

import java.util.ArrayList;
import java.util.Date;

public interface IFacility {

	public void setFacilityInfo(IFacilityInfo info);
	public ArrayList<IFacility> listFacilities();
	public IFacilityInfo getFacilityInformation();
	public int requestAvailableCapacity();
	public IFacility addNewFacility(IFacility f);
	public IFacility removeFacility(IFacility f);
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager, ICapacity capacity, Date date);
	
}
