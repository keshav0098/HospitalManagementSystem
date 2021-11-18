package com.keshav.aws.hms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.aws.hms.repository.HospitalRepository;
import com.keshav.aws.hms.util.Hospital;

@RestController
public class HospitalController {

	@Autowired
	private HospitalRepository hospitalRepository;
	
	@GetMapping("/welcome")
	public String welcomeToHospital()
	{
		
		return "welcome to appolo hospitals";
	}
	
	@GetMapping("/DispalyAll")
	public ArrayList<Hospital> publishAllHospital()
	{
		
		return hospitalRepository.getAllHospitals();
	}
	
	
	
	
}
