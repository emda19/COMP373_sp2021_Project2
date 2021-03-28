package com.online.system.model.facility;

import java.util.ArrayList;

public interface IBuildings {

	public ArrayList<IFacility> listFacilities();
	public IFacility addNewFacility(IFacility f);
	public IFacility removeFacility(IFacility f);
}
