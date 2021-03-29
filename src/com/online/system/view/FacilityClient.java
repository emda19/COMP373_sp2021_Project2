package com.online.system.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.system.model.facility.*;
import com.online.system.model.inspection.*;
import com.online.system.model.maintenance.*;
import com.online.system.model.use.*;
import com.online.system.service.BuildingsService;

public class FacilityClient {
// All objects created are interface objects, not classes
	
	public static void main(String[] args) {
		
		//Initialize ApplicationContext
		ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		//Company using this service
		BuildingsService buildingsService = (BuildingsService) appContext.getBean("buildingsService");
		IBuildings buildings = buildingsService.getBuildings(); //ArrayList of facilities created in global variables
		buildings.setCompanyName("Bob's Buildings");
		
		//Create a facility
		IFacility facility1 = (IFacility) appContext.getBean("facility");
		
		//Add the facility to the list of buildings
		buildings.addNewFacility(facility1);
		
		/* --Create the facility info for facility1-- */
		IFacilityInfo facilityInfo1 = (IFacilityInfo) appContext.getBean("facilityInfo");
		//Address
		IAddress address1 = facilityInfo1.getFacilityAddress();
		address1.setStreet("67434 Flower St.");
		address1.setCity("");
		address1.setState("");
		address1.setZipcode("");
		//Manager
		IFacilityManager manager1 = facilityInfo1.getFacilityManager();
		manager1.setManagerID("HV372");
		manager1.setFirstName("Blake");
		manager1.setLastName("Harrison");
		//Phone For Manager
		IPhone phone1 = manager1.getPhoneNumber();
		phone1.setAreaCode("496");
		phone1.setPhoneNumber("9013896");
		manager1.setPhoneNumber(phone1);
		//Capacity
		ICapacity capacity1 = facilityInfo1.getCapacity();
		capacity1.setNumTotalUnits(50);
		capacity1.setNumRentedUnits(15);
		//Info
		facilityInfo1.setFacilityID("ZX873");
		facilityInfo1.setFacilityName("Scoop Towers");
	}
}
