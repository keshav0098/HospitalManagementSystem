package com.keshav.aws.hms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.aws.hms.util.Hospital;

@RestController
public class HospitalController {

	@GetMapping("/hospital")
	public List<Hospital> getAllHospitals()
	{
		
		return dummyHospitalDB();
	}
	
	public List<Hospital> dummyHospitalDB()
	{
		
		return List.of(new Hospital(1, "Appolo"),new Hospital(2, "HSBC"),new Hospital(3, "PGID"),new Hospital(4, "Martin Hospitals"));
		
	}
}
