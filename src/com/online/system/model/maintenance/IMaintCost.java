package com.online.system.model.maintenance;

public interface IMaintCost {

	public String getCostID();
	public void setCostID(String id);
	public float getLaborCost();
	public void setLaborCost(float lc);
	public float getMaterialCost();
	public void setMaterialCost(float ec);
	public float getTotalCost();
	public void setTotalCost(float tc);
}
