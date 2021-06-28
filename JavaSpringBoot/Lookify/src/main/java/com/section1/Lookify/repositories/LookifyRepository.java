package com.section1.Lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.section1.Lookify.models.Lookify;

@Repository
	public interface LookifyRepository extends CrudRepository<Lookify, Long>{
	    // this method retrieves all the books from the database
	    List<Lookify> findAll();
	    // this method finds books with descriptions containing the search string
	    List<Lookify> findByArtistContaining(String search);
	    // this method counts how many titles contain a certain string
	    Long countByTitleContaining(String search);
	    // this method deletes a book that starts with a specific title
	    Long deleteByTitleStartingWith(String search);
	}

