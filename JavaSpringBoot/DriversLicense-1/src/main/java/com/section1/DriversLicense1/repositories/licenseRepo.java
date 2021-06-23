package com.section1.DriversLicense1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.section1.DriversLicense1.models.License;

public interface licenseRepo extends CrudRepository<License, Long>{
	public List<License> findAll();
	public License findTopByOrderByNumberDesc();
}
