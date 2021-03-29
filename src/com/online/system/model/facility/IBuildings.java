package com.online.system.model.facility;

import java.util.List;

public interface IBuildings {

	public void setCompanyName(String name);
	public String getCompanyName();
	public List<IFacility> listFacilities();
	public void setFacilities(List<IFacility> list);
	public IFacility addNewFacility(IFacility f);
	public IFacility removeFacility(IFacility f);
}
