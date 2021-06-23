package com.section1.DriversLicense1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.section1.DriversLicense1.models.License;
import com.section1.DriversLicense1.models.Person;
import com.section1.DriversLicense1.repositories.licenseRepo;
import com.section1.DriversLicense1.repositories.personRepo;

@Service
public class OkService {
	private final personRepo personRepo;
	private final licenseRepo licRepo;
	public OkService(personRepo pRepo, licenseRepo licRepo) {
		this.personRepo = pRepo;
		this.licRepo = licRepo;
	}
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return personRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return licRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = licRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
}
