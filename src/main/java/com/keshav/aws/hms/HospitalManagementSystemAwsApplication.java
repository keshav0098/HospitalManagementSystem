package com.keshav.aws.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HospitalManagementSystemAwsApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(HospitalManagementSystemAwsApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementSystemAwsApplication.class, args);
	}

}
