package com.online.system.model.maintenance;

/* This class is used to hold information for the cost of maintenance */
public class MaintCost {
	private double laborCost;
	private double materialCost;
	private double totalCost;
	
	public MaintCost() {}
	
	//Return the cost of labor
	public double getLaborCost() {
		return laborCost;
	}
	
	//Set the cost of labor
	public void setLaborCost(double lc) {
		this.laborCost = lc;
	}
	
	//Return the cost of materials
	public double getMaterialCost() {
		return materialCost;
	}
	
	//Set the cost of materials
	public void setMaterialCost(double mc) {
		this.materialCost = mc;
	}
	
	//Calculate and return the total cost of the maintenance
	public double findTotalCost() {
		this.totalCost = this.laborCost + this.materialCost;
		return this.totalCost;
	}

}
