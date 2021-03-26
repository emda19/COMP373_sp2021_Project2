package com.online.system.model.maintenance;

public class MaintCost {
    private String costID;
	private float laborCost;
	private float equipmentCost;
	private float totalCost;
	
	public MaintCost() {}
	
	//Get cost ID
	public String getCostID() {
		return costID;
	}
	
	//Set cost ID
	public void setCostID(String id) {
		this.costID = id;
	}
	
	//Get labor cost
	public float getLaborCost() {
		return laborCost;
	}
	
	//Set labor cost
	public void setLaborCost(float lc) {
		this.laborCost = lc;
	}
	
	//Get material cost
	public float getMaterialCost() {
		return equipmentCost;
	}
	
	//Set material cost
	public void setMaterialCost(float ec) {
		this.equipmentCost = ec;
	}
	
	//Get total cost
	public float getTotalCost() {
		return totalCost;
	}
	
	//Set total cost
	public void setTotalCost(float tc) {
		this.totalCost = tc;
	}

}
