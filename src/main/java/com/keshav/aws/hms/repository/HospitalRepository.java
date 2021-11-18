package com.keshav.aws.hms.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.keshav.aws.hms.util.Hospital;

@Repository
public class HospitalRepository {

	static ArrayList<Hospital> hospitalList=new ArrayList<>();
	static
	{
		
		hospitalList.add(new Hospital(1, "Keshav Hospitals"));
		hospitalList.add(new Hospital(2, "Harshit Hospitals"));
		hospitalList.add(new Hospital(3, "Anurag Hospitals"));
		hospitalList.add(new Hospital(4, "Abhishek Hospitals"));
		hospitalList.add(new Hospital(5, "Vijit Hospitals"));
		
	}
	
	public ArrayList<Hospital> getAllHospitals()
	{
		
		return hospitalList;
		
	}
}
