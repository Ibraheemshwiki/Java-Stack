package com.section1.DojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.section1.DojosNinjas.models.Dojo;
import com.section1.DojosNinjas.models.Ninja;
import com.section1.DojosNinjas.repositories.DojoRepository;
import com.section1.DojosNinjas.repositories.NinjaRepository;
@Service
public class DojoNinjaService {
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	
	public DojoNinjaService(DojoRepository dRepo, NinjaRepository nRepo) {
		this.dojoRepo = dRepo;
		this.ninjaRepo = nRepo;
	}
	public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }
	
	public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }
	
	public DojoRepository getDojoRepo() {
		return dojoRepo;
	}

	public Dojo createDojo(Dojo d) {
        return dojoRepo.save(d);
    }
	
	public NinjaRepository getNinjaRepo() {
		return ninjaRepo;
	}

	public Ninja createNinja(Ninja n) {
        return ninjaRepo.save(n);
    }
	
	public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
	}
        
        public Ninja findNinja(Long id) {
            Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
            if(optionalNinja.isPresent()) {
                return optionalNinja.get();
            } else {
                return null;
            }
    }
	
	
	
}
