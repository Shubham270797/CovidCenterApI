package com.training.amdocs.covidapl.Services;

import java.util.List;

import com.training.amdocs.covidapl.Entity.CovidCenterTable;

public interface CovidCenterServices {

	//Get list Of All Centers
	List<CovidCenterTable> getAllCovidCenters();
	
    //Get center by using pincode
	CovidCenterTable getCenterByPincode(String pincode);
	
	//Add new Center
	String addNewCenter(CovidCenterTable center);
		
}
