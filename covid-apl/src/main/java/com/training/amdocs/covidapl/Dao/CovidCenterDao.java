package com.training.amdocs.covidapl.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.amdocs.covidapl.Entity.CovidCenterTable;

@Component
public class CovidCenterDao {

	List<CovidCenterTable> list =new ArrayList<CovidCenterTable>();

	public List<CovidCenterTable> getAllCovidCenters() {
		// TODO Auto-generated method stub
		list.add(new CovidCenterTable("CC-01","Vinayak Hospital","Pune","422001"));
		list.add(new CovidCenterTable("CC-02","Vinayak Hospital","Nasik","412012"));
		list.add(new CovidCenterTable("CC-03","Vinayak Hospital","Nagar","413601"));
		
		return list;
		
		
	}


	public CovidCenterTable getCenterByPincode(String pincode) {
		// TODO Auto-generated method stub
		System.out.println("In Dao");
	return getAllCovidCenters().stream().filter(p->p.getCenterPinCode().equals(pincode)).findFirst().get();
		
	}

	public boolean addNewCenter(String id,String centerName,String centerCity,String centerPinCode) {
		// TODO Auto-generated method stub
		list.add(new CovidCenterTable(id,centerName,centerCity,centerPinCode));
		CovidCenterTable center=getAllCovidCenters().stream().filter(center1->center1.getId().equals(id)).findFirst().get();
		if(center != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
