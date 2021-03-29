package com.online.system.model.inspection;

/* This class is used to hold the information for a facility inspection */
public class Inspection implements I_Inspection {
    
	private String inspectionID;
    private String inspectionDate;
    private String inspectionDescription;
    private String outcome;
	
    public Inspection() {}
    
    //Set the inspection id number
	public void setInspectionID(String id) {
		this.inspectionID = id;
	}
    
	//Return the inspection id number
	public String getInspectionID() {
		return this.inspectionID;
	}
	
	//Set the date of the inspection
	public void setInspectionDate(String date) {
		this.inspectionDate = date;
	}
	
	//Return the date of the inspection
	public String getInspectionDate() {
		return this.inspectionDate;
	}
	
	//Set the inspection description
	public void setInspectionDescription(String s) {
		this.inspectionDescription = s;
	}
	
	//Return the inspection description
	public String getInspectionDescription() {
		return this.inspectionDescription;
	}
	
	//Set the inspection outcome
	public void setInspectionOutcome(String s) {
		this.outcome = s;
	}
	
	//Return the inspection outcome
	public String getInspectionOutcome() {
		return this.outcome;
	}
	
	/*
	public String toString() {
		String id = "ID: " + this.inspectionID;
		String date = "Date: " + this.inspectionDate.toString();
		String desc = "Description: " + this.inspectionDescription;
		String out = "Outcome: " + this.outcome;
		return id + "\n" + date + "\n" + desc + "\n" + out;
	}
	*/
    
}

