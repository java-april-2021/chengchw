package com.chengchw.driverLicence.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chengchw.driverLicence.Model.Driver;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {

	List<Driver> findAll();
	
	List<Driver> findByLicenseIsNull();
}
