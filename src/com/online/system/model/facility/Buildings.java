package com.online.system.model.facility;

import java.util.List;

/* This class is used to keep track of all facilities owned by a company */
public class Buildings implements IBuildings {

	private List<IFacility> facilities;
	private String companyName;
	
	public Buildings() {}
	
	//Set the name of the company managing these buildings
	public void setCompanyName(String name) {
		this.companyName = name;
	}
	
	//Return the name of the company managing these buildings
	public String getCompanyName() {
		return this.companyName;
	}
	
	//Return a list of all facilities in the system
	public List<IFacility> listFacilities() {
		return this.facilities;
	}
	
	public void setFacilities(List<IFacility> list) {
		this.facilities = list;
	}
	
	//Add a new facility to the list of total facilities
	public IFacility addNewFacility(IFacility f) {
		facilities.add(f);
		return facilities.get(facilities.size()-1);
	}

	//Remove a facility from the list of total facilities
	public IFacility removeFacility(IFacility f) {
		this.facilities.remove(f);
		return f;
	}
}
