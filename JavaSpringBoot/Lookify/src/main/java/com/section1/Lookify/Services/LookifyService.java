package com.section1.Lookify.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.section1.Lookify.models.Lookify;
import com.section1.Lookify.repositories.LookifyRepository;

@Service
public class LookifyService {

    private final LookifyRepository lookifyRepository;
    
    public LookifyService(LookifyRepository lookifyRepository) {
        this.lookifyRepository = lookifyRepository;
    }

    public List<Lookify> allLookifies() {
        return lookifyRepository.findAll();
    }

    public Lookify createLookify(Lookify b) {
        return lookifyRepository.save(b);
    }
 
    public Lookify findLookify(Long id) {
        Optional<Lookify> optionalLookify = lookifyRepository.findById(id);
        if(optionalLookify.isPresent()) {
            return optionalLookify.get();
        } else {
            return null;
        }
    }

	public Lookify updateLookify(Long id, String title, String artist, Integer rating) {
	Lookify lookify = findLookify(id);
	lookify.setTitle(title);
	lookify.setArtist(artist);
	lookify.setRating(rating);
		return lookifyRepository.save(lookify);
	}

	public void deletesong(Long id) {
		lookifyRepository.deleteById(id);
	}
	
	public List<Lookify> findArtist(String artist){
		return lookifyRepository.findByArtistContaining(artist);
	}
}