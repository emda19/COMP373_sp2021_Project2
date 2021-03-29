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
		
		/* --Create a facility-- */
		IFacility facility1 = (IFacility) appContext.getBean("facility");
		
		//Add the facility to the list of buildings
		buildings.addNewFacility(facility1);
		
		/* --Create the facility info for facility1-- */
		IFacilityInfo facilityInfo1 = (IFacilityInfo) appContext.getBean("facilityInfo");
		//Address
		IAddress address1 = facilityInfo1.getFacilityAddress();
		address1.setStreet("67434 Flower St.");
		address1.setCity("Chicago");
		address1.setState("IL");
		address1.setZipcode("60660");
		//Manager
		IFacilityManager manager1 = (IFacilityManager) appContext.getBean("manager");
		manager1.setManagerID("HV372");
		manager1.setFirstName("Blake");
		manager1.setLastName("Harrison");
		//Phone For Manager
		IPhone phone1 = manager1.getPhoneNumber();
		phone1.setAreaCode("312");
		phone1.setPhoneNumber("9013896");
		manager1.setPhoneNumber(phone1);
		//Capacity
		ICapacity capacity1 = facilityInfo1.getCapacity();
		capacity1.setNumTotalUnits(50);
		capacity1.setNumRentedUnits(15);
		//Info
		facilityInfo1.setFacilityID("ZX873");
		facilityInfo1.setFacilityName("Scoop Towers");
		//facilityInfo1.setFacilityAddress(address1);
		facilityInfo1.setFacilityManager(manager1);
		//facilityInfo1.setCapacity(capacity1);
		facilityInfo1.setDateOpened("08/11/2011");
		
		//Associate Info with Facility
		facility1.setFacilityInformation(facilityInfo1);
		
		
		/* --Create an Inspection Log-- */
		I_InspectionLog inspectionLog1 = (I_InspectionLog) appContext.getBean("inspectionLog");
		
		/* --Create an Inspection-- */
		I_Inspection inspection1 = (I_Inspection) appContext.getBean("inspection");
		inspection1.setInspectionID("938FN");
		inspection1.setInspectionDate("03/20/2012");
		inspection1.setInspectionDescription("Routine elevator inspection");
		inspection1.setInspectionOutcome("Elevator is in proper working order");
		//Add the inspection to the log
		inspectionLog1.addInspection(inspection1);
		/* --Create another Inspection-- */
		I_Inspection inspection2 = (I_Inspection) appContext.getBean("inspection");
		inspection2.setInspectionID("026RL");
		inspection2.setInspectionDate("04/07/2012");
		inspection2.setInspectionDescription("Routine check for pests");
		inspection2.setInspectionOutcome("Rats found in the building");
		//Add the inspection to the log
		inspectionLog1.addInspection(inspection2);
		
		
		/* --Create a Maintenance Log-- */
		IMaintLog maintLog1 = (IMaintLog) appContext.getBean("maintLog");
		maintLog1.setDaysRunning("08/11/2011", "05/02/2017");
		
		/* --Create a Maintenance Request-- */
		IMaintRequest request1 = (IMaintRequest) appContext.getBean("request");
		request1.setRequestID("0325X");
		request1.setDateRequested("04/07/2012");
		request1.setRequestDescription("Exterminator needed for rat problems");
		request1.setRequestStatus(true);
		//Add the request to the log
		maintLog1.makeFacilityMaintRequest(request1);
		
		/* --Create a Scheduled Maintenance Job-- */
		IMaintenance maintenance1 = (IMaintenance) appContext.getBean("maintenance");
		//MaintCost for Job
		IMaintCost cost1 = maintenance1.getMaintCost();
		cost1.setLaborCost(150.65);
		cost1.setMaterialCost(75.32);
		
		maintenance1.setScheduleID("YDB930");
		//maintenance1.setMaintCost(cost1);
		maintenance1.setScheduleDate("04/10/2012");
		//Add the maintenance job to the log
		maintLog1.scheduleMaintenance(maintenance1);
		
		
		/* --Create Use Log-- */
		IUseLog useLog1 = (IUseLog) appContext.getBean("useLog");
		
		/* --Create First Usage-- */
		IUsage usage1 = (IUsage) appContext.getBean("usage");
		//User for Usage1
		IFacilityUser user1 = usage1.getUser();
		user1.setUserID("JKS742");
		user1.setFirstName("");
		user1.setLastName("");
		//Use Interval for Usage1
		IUseInterval interval1 = usage1.getUseInterval();
		interval1.setStartDate("02/01/2012");
		interval1.setEndDate("02/01/2013");
		
		//usage1.setUser(user1);
		//usage1.setUseInterval(interval1);
		usage1.setDaysUsed(365);
		//Add usage1 to the log
		useLog1.assignFacilityToUse(usage1);
		
		/* --Create Second Usage-- */
		IUsage usage2 = (IUsage) appContext.getBean("usage");
		//User for Usage2
		IFacilityUser user2 = usage2.getUser();
		user2.setUserID("LDB934");
		user2.setFirstName("");
		user2.setLastName("");
		//Use Interval for Usage2
		IUseInterval interval2 = usage2.getUseInterval();
		interval2.setStartDate("05/30/2012");
		interval2.setEndDate("05/30/2013");
		
		//usage2.setUser(user2);
		//usage2.setUseInterval(interval2);
		usage2.setDaysUsed(365);
		//Add usage2 to the log
		useLog1.assignFacilityToUse(usage2);
		
		
		/* --Print out Facility Summary-- */
		
		
		/* --Print out Inspection Summary-- */
		
		
		/* --Print out Maintenance Summary-- */
		
		
		/* --Print out Usage Summary-- */
		
		
	}
}
