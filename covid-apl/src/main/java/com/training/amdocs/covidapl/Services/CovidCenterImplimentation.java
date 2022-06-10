package com.training.amdocs.covidapl.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.amdocs.covidapl.Dao.CovidCenterDao;
import com.training.amdocs.covidapl.Entity.CovidCenterTable;

@Component
public class CovidCenterImplimentation implements CovidCenterServices {

	@Autowired
	CovidCenterDao centerDao;
	
	@Override
	public List<CovidCenterTable> getAllCovidCenters() {
		// TODO Auto-generated method stub
		return centerDao.getAllCovidCenters();
	}

	@Override
	public CovidCenterTable getCenterByPincode(String pincode) {
		// TODO Auto-generated method stub
		return centerDao.getCenterByPincode(pincode);
	}

	@Override
	public String addNewCenter(CovidCenterTable center) {
		// TODO Auto-generated method stub
		Boolean bool= centerDao.addNewCenter(center.getId(),center.getCenterName(),center.getCenterCity(),center.getCenterPinCode());
	  if(bool)
	  {
		  return "New Center Added";
	  }
	  else
		  return "New Center Not Added";
	
	}

}
