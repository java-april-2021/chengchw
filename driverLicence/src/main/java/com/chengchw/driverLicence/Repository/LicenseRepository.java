package com.chengchw.driverLicence.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chengchw.driverLicence.Model.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{
	
	List<License> findAll();
	
	License findTopByOrderByLicenseNumDesc();
	
	
}
