package com.training.amdocs.covidapl.Entity;



public class CovidCenterTable {
	String id;
	String centerName;
	String centerCity;
	String centerPinCode;
	
	
	public CovidCenterTable(String id, String centerName, String centerCity, String centerPinCode) {
		this.id = id;
		this.centerName = centerName;
		this.centerCity = centerCity;
		this.centerPinCode = centerPinCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterCity() {
		return centerCity;
	}
	public void setCenterCity(String centerCity) {
		this.centerCity = centerCity;
	}
	public String getCenterPinCode() {
		return centerPinCode;
	}
	public void setCenterPinCode(String centerPinCode) {
		this.centerPinCode = centerPinCode;
	}
	
	
	
	
	
	
	
	
	
}
