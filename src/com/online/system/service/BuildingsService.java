package com.online.system.service;

import com.online.system.model.facility.IBuildings;

public class BuildingsService {
	private IBuildings buildings;
	
	public BuildingsService() {}
	
	public void setBuildings(IBuildings buildings) {
		this.buildings = buildings;
	}
	
	public IBuildings getBuildings() {
		return this.buildings;
	}
}
