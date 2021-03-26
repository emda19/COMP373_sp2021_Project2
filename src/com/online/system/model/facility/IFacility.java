package com.online.system.model.facility;

import java.util.ArrayList;
import java.util.Date;

public interface IFacility {

	public ArrayList<Facility> listFacilities();
	public FacilityInfo getFacilityInformation();
	public int requestAvailableCapacity();
	public Facility addNewFacility(Facility f);
	public FacilityInfo addFacilityDetail(String id, String name, Address address, FacilityManager manager, FacilityCapacity capacity, Date date);
	public Facility removeFacility(Facility f);
	
}
