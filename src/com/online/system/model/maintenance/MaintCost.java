package com.online.system.model.maintenance;

/* This class is used to hold information for the cost of maintenance */
public class MaintCost {
    private String costID;
	private float laborCost;
	private float equipmentCost;
	private float totalCost;
	
	public MaintCost() {}
	
	//Return the cost ID number
	public String getCostID() {
		return costID;
	}
	
	//Set the cost ID number
	public void setCostID(String id) {
		this.costID = id;
	}
	
	//Return the cost of labor
	public float getLaborCost() {
		return laborCost;
	}
	
	//Set the cost of labor
	public void setLaborCost(float lc) {
		this.laborCost = lc;
	}
	
	//Return the cost of materials
	public float getMaterialCost() {
		return equipmentCost;
	}
	
	//Set the cost of materials
	public void setMaterialCost(float ec) {
		this.equipmentCost = ec;
	}
	
	//Return the total cost of the maintenance
	public float getTotalCost() {
		return totalCost;
	}
	
	//Set the total cost of the maintenance
	public void setTotalCost(float tc) {
		this.totalCost = tc;
	}

}
