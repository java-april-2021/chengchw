package com.chengchw.driverLicence.Services;

import org.springframework.stereotype.Service;

import com.chengchw.driverLicence.Repository.LicenseRepository;

import com.chengchw.driverLicence.Model.License;

@Service
public class LicenseService {

	private final LicenseRepository lisenceRepo;
	
	public LicenseService(LicenseRepository lisenceRepo) {
		
		this.lisenceRepo = lisenceRepo;
	}
	
	public License createLicense(License license) {
		
		int licNum = this.generateLicenseNum();
		
		license.setLicenseNum(licNum);
		
		return this.lisenceRepo.save(license);
		
	}
	
	
	
	
	  public int generateLicenseNum() {
	  
		  License topLic = this.lisenceRepo.findTopByOrderByLicenseNumDesc();
		  if (topLic == null) {
			  return 1;
			  
		  }
		  
		  return topLic.getLicenseNum()+1;
	   
	}
	 
}
