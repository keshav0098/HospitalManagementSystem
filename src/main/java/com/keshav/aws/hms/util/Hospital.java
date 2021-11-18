package com.keshav.aws.hms.util;

public class Hospital {
	private int hospitalID;
	public int getHospitalID() {
		return hospitalID;
	}
	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}
	public Hospital() {
	}
	@Override
	public String toString() {
		return "Hospital [hospitalID=" + hospitalID + ", hospitalName=" + hospitalName + "]";
	}
	public Hospital(int hospitalID, String hospitalName) {
		super();
		this.hospitalID = hospitalID;
		this.hospitalName = hospitalName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	private String hospitalName;

}
