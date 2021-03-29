package com.online.system.model.facility;

import com.online.system.model.inspection.I_InspectionLog;
import com.online.system.model.maintenance.IMaintLog;
import com.online.system.model.use.IUseLog;

public interface IFacility {

	public void setInspectionLog(I_InspectionLog log);
	public I_InspectionLog getInspectionLog();
	public void setMaintLog(IMaintLog log);
	public IMaintLog getMaintLog();
	public void setUseLog(IUseLog log);
	public IUseLog getUseLog();
	public void setFacilityInfo(IFacilityInfo info);
	public IFacilityInfo getFacilityInfo();
	public int requestAvailableCapacity();
	public IFacilityInfo addFacilityDetail(String id, String name, IAddress address, IFacilityManager manager, ICapacity capacity, String date);
	
}
