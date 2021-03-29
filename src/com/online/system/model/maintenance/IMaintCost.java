package com.online.system.model.maintenance;

public interface IMaintCost {

	public double getLaborCost();
	public void setLaborCost(double lc);
	public double getMaterialCost();
	public void setMaterialCost(double mc);
	public double findTotalCost();
}
