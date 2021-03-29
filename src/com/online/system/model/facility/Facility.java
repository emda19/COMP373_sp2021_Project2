package com.online.system.model.facility;

/* This class is used to manage the information and capacity associated with each facility */
public class Facility implements IFacility {

	private IFacilityInfo info;
	
	public Facility() {}

	//Set the set of information associated with a facility
	public void setFacilityInformation(IFacilityInfo info) {
		this.info = info;
	}
	
	//Return the set of information associated with a facility
	public IFacilityInfo getFacilityInformation() {
		return this.info;
	}

	//Return the available units of a facility
	public int requestAvailableCapacity() {
		ICapacity capacity = this.info.getCapacity();
		return capacity.getNumAvailableUnits();
	}

	//Manually update the set of information associated with a facility
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager,
			ICapacity capacity, String date) {
		this.info.setFacilityID(id);
		this.info.setFacilityName(name);
		this.info.setFacilityAddress(address);
		this.info.setFacilityManager(manager);
		this.info.setCapacity(capacity);
		return this.info;
	}

}
