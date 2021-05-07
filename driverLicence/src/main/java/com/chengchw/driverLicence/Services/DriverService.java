package com.chengchw.driverLicence.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.driverLicence.Model.Driver;
import com.chengchw.driverLicence.Repository.DriverRepository;

@Service
public class DriverService {
	
	private final DriverRepository driverrepo;
	
	public DriverService(DriverRepository driverrepo) {
		
		this.driverrepo = driverrepo;
	}
	
	
	public List<Driver> getAllDriver(){
		
		return this.driverrepo.findAll();
	}
	
	public Driver createNewDriver(Driver driver) {
		
		return this.driverrepo.save(driver);
	}
	
	public Driver getDriverById(Long id) {
		
		return this.driverrepo.findById(id).get();
		
	}
	
	public List<Driver> getDriverWithoutLic() {
		
		return this.driverrepo.findByLicenseIsNull();
	}
	
	
	
	
}


