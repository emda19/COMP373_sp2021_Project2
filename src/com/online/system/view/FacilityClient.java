package com.online.system.view;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.online.system.model.facility.*;
import com.online.system.model.inspection.*;
import com.online.system.model.maintenance.*;
import com.online.system.model.use.*;
import com.online.system.service.BuildingsService;

public class FacilityClient {
	
	public static void main(String[] args) {
		
		//Initialize ApplicationContext
		@SuppressWarnings("resource")
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
		IFacilityInfo facilityInfo1 = facility1.getFacilityInfo();
		//Address
		IAddress address1 = facilityInfo1.getAddress();
		address1.setStreet("67434 Flower St.");
		address1.setCity("Chicago");
		address1.setState("IL");
		address1.setZipcode("60660");
		//Manager
		IFacilityManager manager1 = facilityInfo1.getFacilityManager();
		manager1.setManagerID("HV372");
		manager1.setFirstName("Blake");
		manager1.setLastName("Harrison");
		//Phone For Manager
		IPhone phone1 = manager1.getPhone();
		phone1.setAreaCode("312");
		phone1.setPhoneNumber("9013896");
		//Capacity
		ICapacity capacity1 = facilityInfo1.getCapacity();
		capacity1.setNumTotalUnits(50);
		capacity1.setNumRentedUnits(2);
		//Info
		facilityInfo1.setFacilityID("ZX873");
		facilityInfo1.setFacilityName("Scoop Towers");
		facilityInfo1.setDateOpened("08/11/2011");
		
		//Associate Info with Facility
		
		
		/* --Create an Inspection Log-- */
		I_InspectionLog inspectionLog1 = (I_InspectionLog) appContext.getBean("inspectionLog");
		//Associate log with facility1
		facility1.setInspectionLog(inspectionLog1);
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
		//Associate maintenance log with facility1
		facility1.setMaintLog(maintLog1);
		maintLog1.setDaysRunning("08/11/2011", "05/02/2017");
		
		/* --Create a Maintenance Request-- */
		IMaintRequest request1 = (IMaintRequest) appContext.getBean("maintRequest");
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
		maintenance1.setMaintCost(cost1);
		maintenance1.setScheduleDate("04/10/2012");
		//Add the maintenance job to the log
		maintLog1.scheduleMaintenance(maintenance1);
		
		
		/* --Create Use Log-- */
		IUseLog useLog1 = (IUseLog) appContext.getBean("useLog");
		//Associate use log with facility1
		facility1.setUseLog(useLog1);
		
		/* --Create First Usage-- */
		IUsage usage1 = (IUsage) appContext.getBean("usage");
		//User for Usage1
		IFacilityUser user1 = usage1.getFacilityUser();
		user1.setUserID("JKS742");
		user1.setFirstName("E., Claire");
		user1.setLastName("Baker");
		user1.setUnitNum("#102");
		//Use Interval for Usage1
		IUseInterval interval1 = usage1.getUseInterval();
		interval1.setStartDate("02/01/2012");
		interval1.setEndDate("02/01/2013");
		interval1.setDaysUsed(); //calculates days used based on start & end date
		//Add usage1 to the log
		useLog1.assignFacilityToUse(usage1);
				
		/* --Create Second Usage-- */
		IUsage usage2 = (IUsage) appContext.getBean("usage");
		//User for Usage2
		IFacilityUser user2 = usage2.getFacilityUser();
		user2.setUserID("LDB934");
		user2.setFirstName("Petunia");
		user2.setLastName("Gardener");
		user2.setUnitNum("#502");
		//Use Interval for Usage2
		IUseInterval interval2 = usage2.getUseInterval();
		interval2.setStartDate("05/30/2012");
		interval2.setEndDate("05/30/2013");
		interval2.setDaysUsed(); //calculates days in use based on start & end date
		//Add usage2 to log
		useLog1.assignFacilityToUse(usage2);
		
		/* --Add a Second Facility-- */
		IFacility facility2 = (IFacility) appContext.getBean("facility");
		buildings.addNewFacility(facility2);
		//Address
		//IAddress address2 = (IAddress) appContext.getBean("address");
		IAddress address2 = facility2.getFacilityInfo().getAddress();
		address2.setStreet("0398 W. Hollywood St.");
		address2.setCity("San Diego");
		address2.setState("CA");
		address2.setZipcode("92102");
		//Manager
		//IFacilityManager manager2 = (IFacilityManager) appContext.getBean("facilityManager");
		IFacilityManager manager2 = facility2.getFacilityInfo().getFacilityManager();
		manager2.setManagerID("KM029");
		manager2.setFirstName("Kate");
		manager2.setLastName("Harbour");
		//Phone For Manager
		IPhone phone2 = manager2.getPhone();
		phone2.setAreaCode("619");
		phone2.setPhoneNumber("3302648");
		//Capacity
		//ICapacity capacity2 = (ICapacity) appContext.getBean("capacity");
		ICapacity capacity2 = facility2.getFacilityInfo().getCapacity();
		capacity2.setNumTotalUnits(100);
		capacity2.setNumRentedUnits(0);
		//Manually fill out details
		facility2.addFacilityDetail("933OS","Dizzy Apartments",address2,manager2,capacity2,"09/15/2020");
		
		
		/* --Print out Buildings' Facilities Summary-- */
		System.out.println("Company: "+buildings.getCompanyName());
		System.out.println("\n\t\t\t\t**--Facilities--**");
		List<IFacility> listFacilities = buildings.listFacilities();
		for (IFacility facility : listFacilities) {
			System.out.println("\nName: "+facility.getFacilityInfo().getFacilityName());
			System.out.println("Facility ID: "+facility.getFacilityInfo().getFacilityID());
			System.out.println("Date opened: "+facility.getFacilityInfo().getDateOpened());
			System.out.println("\nManager: "+facility.getFacilityInfo().getFacilityManager().getFirstName()
					+" "+facility.getFacilityInfo().getFacilityManager().getLastName());
			System.out.println("\tManager ID: "+facility.getFacilityInfo().getFacilityManager().getManagerID());
			String areaCode = facility.getFacilityInfo().getFacilityManager().getPhone().getAreaCode();
			String phoneNumber = facility.getFacilityInfo().getFacilityManager().getPhone().getPhoneNumber();
			System.out.println("\tPhone: ("+areaCode+") "+phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3));
			System.out.println("\nAddress:");
			String street = facility.getFacilityInfo().getAddress().getStreet();
			String city = facility.getFacilityInfo().getAddress().getCity();
			String state = facility.getFacilityInfo().getAddress().getState();
			String zipcode = facility.getFacilityInfo().getAddress().getZipcode();
			System.out.println("\t"+street);
			System.out.println("\t"+city+", "+state+" "+zipcode);
			System.out.println("\nCapacity: ");
			System.out.println("\tTotal Units: "+facility.getFacilityInfo().getCapacity().getNumTotalUnits());
			System.out.println("\tRented Units: "+facility.getFacilityInfo().getCapacity().getNumRentedUnits());
			System.out.println("\tAvailable Units: "+facility.requestAvailableCapacity());
			
			/* --Print out Inspection Summary for each Facility-- */
			List<I_Inspection> inspectionsList = facility.getInspectionLog().listInspections();
			System.out.println("\nInspection Summary:");
			for (I_Inspection inspection : inspectionsList) {
				System.out.println("\n\tInspection ID#: "+inspection.getInspectionID());
				System.out.println("\tDate: "+inspection.getInspectionDate());
				System.out.println("\tDescription: "+inspection.getInspectionDescription());
				System.out.println("\tOutcome: "+inspection.getInspectionOutcome());
			}
			
			/* --Print out Maintenance Summary for each Facility-- */
			/* --Requests-- */
			List<IMaintRequest> requestList = facility.getMaintLog().listRequests();
			System.out.println("\nMaintenance Summary:");
			System.out.println("\n\tRequests:");
			for (IMaintRequest request : requestList) {
				System.out.println("\n\t\tRequest ID#: "+request.getRequestID());
				System.out.println("\t\tDate: "+request.getDateRequested());
				System.out.println("\t\tDescription: "+request.getRequestDescription());
				if (request.getRequestStatus()) { //if true
					System.out.println("\t\tStatus: Open");
				} else { //if false
					System.out.println("\t\tStatus: Closed");
				}
			}
			/* --Scheduled Maintenance-- */
			List<IMaintenance> maintList = facility.getMaintLog().listMaintenance();
			System.out.println("\n\tScheduled Maintenance: ");
			for (IMaintenance maint : maintList) {
				System.out.println("\n\t\tJob ID#: "+maint.getScheduleID());
				System.out.println("\t\tScheduled date: "+maint.getScheduleDate());
				System.out.println("\t\tCost Summary: ");
				System.out.println("\t\tCost for labor: $"+maint.getMaintCost().getLaborCost());
				System.out.println("\t\t\tCost for materials: $"+maint.getMaintCost().getMaterialCost());
				System.out.println("\t\t\tTotal Cost: $"+maint.getMaintCost().findTotalCost());
				if (maint.isCompleted()) { //if true
					System.out.println("\t\tStatus: Completed");
				} else { //if false
					System.out.println("\t\tStatus: Pending");
				}
			}
			//Problems
			List<String> problems = facility.getMaintLog().listFacilityProblems();
			System.out.println("\n\tFacility Problems List: ");
			for (String problem : problems) {
				System.out.println("\t\t"+problem);
			}
			float problemRate = facility.getMaintLog().calcProblemRateForFacility();
			System.out.println("\n\tProblem Rate: "+problemRate);
			//Total Maintenance Costs for Facility
			double totalCost = facility.getMaintLog().calcMaintenanceCostForFacility();
			System.out.println("\n\tTotal Maintenance Costs: $"+totalCost);
			//Down Time for Facility
			float downTime = facility.getMaintLog().calcDownTimeForFacility();
			System.out.println("\n\tTotal Down Time: "+downTime+" days");
			
			/* --Print out Usage Summary for each Facility-- */
			System.out.println("\nUsage Summary: ");
			List<IUsage> usagesList = facility.getUseLog().listUsages();
			for (IUsage use : usagesList) {
				//User
				String firstName = use.getFacilityUser().getFirstName();
				String lastName = use.getFacilityUser().getLastName();
				String userID = use.getFacilityUser().getUserID();
				String unitNumber = use.getFacilityUser().getUnitNum();
				System.out.println("\n\tUser: "+firstName+" "+lastName);
				System.out.println("\t\tID#: "+userID);
				System.out.println("\t\tUnit: "+unitNumber);
				//Use Interval
				String startDate = use.getUseInterval().getStartDate();
				String endDate = use.getUseInterval().getEndDate();
				long daysInUse = use.getUseInterval().getDaysUsed();
				System.out.println("\t\tStart date: "+startDate);
				System.out.println("\t\tEnd date: "+endDate);
				System.out.println("\t\tDays in use interval: "+daysInUse);
			}
			//Usage Rate
			if (usagesList.size()==0) {
				System.out.println("\n\tTotal Usage Rate: N/A");
			} else {
				float rate = facility.getUseLog().calcUsageRate();
				System.out.println("\n\tTotal Usage Rate: "+rate);
			}
		}
	}
}
