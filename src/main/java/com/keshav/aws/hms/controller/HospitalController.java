package com.keshav.aws.hms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.aws.hms.util.Hospital;

@RestController
public class HospitalController {

	@GetMapping("/hospital")
	public String getAllHospitals()
	{
		
		return "welcome to appolo hospitals";
	}
	
	
}
