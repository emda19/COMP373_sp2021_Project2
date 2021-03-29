package com.online.system.model.facility;

import java.util.ArrayList;

public interface IBuildings {

	public void setCompanyName(String name);
	public String getCompanyName();
	public ArrayList<IFacility> listFacilities();
	public IFacility addNewFacility(IFacility f);
	public IFacility removeFacility(IFacility f);
}
