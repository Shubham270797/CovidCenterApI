package com.training.amdocs.covidapl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.covidapl.Entity.CovidCenterTable;
import com.training.amdocs.covidapl.Services.CovidCenterImplimentation;



@RestController
public class CovidCenterController {

	@Autowired
	CovidCenterImplimentation covidCenterImpl;	
	
	@GetMapping("/getAllCenters")
	public List<CovidCenterTable> getAllCovidCenters() {
		// TODO Auto-generated method stub
		return covidCenterImpl.getAllCovidCenters();
	}

	@GetMapping("/getCenter")
	public CovidCenterTable getCenterByPincode(@RequestParam String pincode) {
		// TODO Auto-generated method stub
		System.out.println("in controller");
		return covidCenterImpl.getCenterByPincode(pincode);
	}

	@PostMapping("/addCenter")
	public String addNewCenter(@RequestBody CovidCenterTable center)
	 {
		// TODO Auto-generated method stub
	return covidCenterImpl.addNewCenter(center);
	
	}

	
	
	
	
	
	

}
