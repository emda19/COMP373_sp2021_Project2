package com.online.system.model.facility;

import java.util.ArrayList;
import java.util.Date;


public class Facility implements IFacility {

	private ArrayList<IFacility> facilities;
	private IFacilityInfo info;
	
	public Facility() {}

	public void setFacilityInfo(IFacilityInfo info) {
		this.info = info;
	}
	
	@Override
	public ArrayList<IFacility> listFacilities() { // INTERFACE or CLASS??
		return this.facilities;
	}

	@Override
	public IFacilityInfo getFacilityInformation() {
		return this.info;
	}

	@Override
	public int requestAvailableCapacity() {
		ICapacity capacity = this.info.getCapacity();
		return capacity.getNumAvailableUnits();
	}

	@Override
	public IFacility addNewFacility(IFacility f) { // INTERFACE or CLASS??
		facilities.add(f);
		return facilities.get(facilities.size()-1);
	}

	@Override
	public IFacility removeFacility(IFacility f) { // INTERFACE or CLASS??
		this.facilities.remove(f);
		return f;
	}

	@Override
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager,
			ICapacity capacity, Date date) {
		this.info.setFacilityID(id);
		this.info.setFacilityName(name);
		this.info.setFacilityAddress(address);
		this.info.setFacilityManager(manager);
		this.info.setCapacity(capacity);
		return this.info;
	}

}
