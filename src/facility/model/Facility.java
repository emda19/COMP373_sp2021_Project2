package facility.model;

import java.util.ArrayList;
import java.util.Date;


public class Facility implements IFacility {

	private ArrayList<Facility> facilities;
	private FacilityInfo info;
	
	public Facility() {
		this.info = new FacilityInfo();
	}

	public void setFacilityInfo(FacilityInfo info) {
		this.info = info;
	}
	
	@Override
	public ArrayList<Facility> listFacilities() {
		return this.facilities;
	}

	@Override
	public FacilityInfo getFacilityInformation() {
		return this.info;
	}

	@Override
	public int requestAvailableCapacity() {
		FacilityCapacity capacity = this.info.getFacilityCapacity();
		return capacity.getNumAvailableUnits();
	}

	@Override
	public Facility addNewFacility(Facility f) {
		facilities.add(f);
		return facilities.get(facilities.size()-1);
	}

	@Override
	public Facility removeFacility(Facility f) {
		this.facilities.remove(f);
		return f;
	}

	@Override
	public FacilityInfo addFacilityDetail(String id, String name, Address address, FacilityManager manager,
			FacilityCapacity capacity, Date date) {
		this.info.setFacilityID(id);
		this.info.setFacilityName(name);
		this.info.setFacilityAddress(address);
		this.info.setFacilityManager(manager);
		this.info.setFacilityCapacity(capacity);
		return this.info;
	}

}
