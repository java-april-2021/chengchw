package com.chengchw.Lookify.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.chengchw.Lookify.Models.Song;

@Repository
public interface LookifyRepository extends CrudRepository<Song, Long>{
	
	List<Song> findAll();	
	
	
	//List<Song> findByDescriptionContaining(String search);
	List<Song> findByTitleContaining(String search);
	List<Song> findByArtistContaining(String artist);
	List<Song> findTop10ByOrderByRatingDesc();
	
		
	//void delet(Song song)
	 //Long countByArtistContaining(String search);
	  
	 //Long deleteByTitleStartingWith(String search);

}
