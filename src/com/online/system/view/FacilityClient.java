package com.online.system.view;

import java.io.File;
import java.util.Date;

import com.online.system.data.DataManager;
import com.online.system.model.facility.*;
import com.online.system.model.inspection.*;
import com.online.system.model.maintenance.*;
import com.online.system.model.use.*;

public class FacilityClient {

	
	public static void main(String[] args) {
		
		/* File could be read in
		File file = new File("FacilityManagementSystem.txt");
		DataManager data = new DataManager();
		data.readFile(file);
		*/
		
		// Create a facility
		Facility LakeSideApartments = new Facility();
		Address address = new Address("8240 Granville", "Apt. 760", "Chicago", "Illinois", "60660");
		Phone phone = new Phone("123","4567890");
		FacilityManager manager = new FacilityManager("75Hd", "Greg", "Smith", phone);
		FacilityCapacity capacity = new FacilityCapacity();
		capacity.setNumTotalUnits(800);
		capacity.setNumRentedUnits(589);
		LakeSideApartments.addFacilityDetail("5h8sD", "LakeSide", address, manager, capacity, new Date());
		
		//Add user
		if (LakeSideApartments.requestAvailableCapacity() > 0) {
			FacilityUser user = new FacilityUser("97F0", "Jane", "Smith");
			@SuppressWarnings("deprecation")
			UseInterval useInterval = new UseInterval(new Date(2001,05,11), new Date(2000,05,11));
			UseLog useLog = new UseLog();
			useLog.setUseLogID("PP878");
			useLog.assignFacilityToUse(user, useInterval);
		}
		
		//Add maintenance
		MaintLog maintLog = new MaintLog();
		maintLog.makeFacilityMaintRequest("7Hsm9", new Date(), "Burst pipe", false);
		
		
	}
}
