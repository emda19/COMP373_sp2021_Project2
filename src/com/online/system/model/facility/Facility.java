package com.online.system.model.facility;

import com.online.system.model.inspection.I_InspectionLog;
import com.online.system.model.maintenance.IMaintLog;
import com.online.system.model.use.IUseLog;

/* This class is used to manage the information and capacity associated with each facility */
public class Facility implements IFacility {

	private IFacilityInfo facilityInfo;
	private I_InspectionLog inspectionLog;
	private IMaintLog maintLog;
	private IUseLog useLog;
	
	public Facility() {}

	//Assign an inspection log to the facility
	public void setInspectionLog(I_InspectionLog log) {
		this.inspectionLog = log;
	}
	//Return the inspection log
	public I_InspectionLog getInspectionLog() {
		return this.inspectionLog;
	}
	//Assign a maintenance log to the facility
	public void setMaintLog(IMaintLog log) {
		this.maintLog = log;
	}
	//Return the maintenance log
	public IMaintLog getMaintLog() {
		return this.maintLog;
	}
	//Assign a use log to the facility
	public void setUseLog(IUseLog log) {
		this.useLog = log;
	}
	//Return the use log
	public IUseLog getUseLog() {
		return this.useLog;
	}
	
	//Set the set of information associated with a facility
	public void setFacilityInfo(IFacilityInfo info) {
		this.facilityInfo = info;
	}
	
	//Return the set of information associated with a facility
	public IFacilityInfo getFacilityInfo() {
		return this.facilityInfo;
	}

	//Return the available units of a facility
	public int requestAvailableCapacity() {
		ICapacity capacity = this.facilityInfo.getCapacity();
		return capacity.getNumAvailableUnits();
	}

	//Manually update the set of information associated with a facility
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager,
			ICapacity capacity, String date) {
		this.facilityInfo.setFacilityID(id);
		this.facilityInfo.setFacilityName(name);
		this.facilityInfo.setAddress(address);
		this.facilityInfo.setFacilityManager(manager);
		this.facilityInfo.setCapacity(capacity);
		return this.facilityInfo;
	}

}
