package com.chengchw.Lookify.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chengchw.Lookify.Models.Song;
import com.chengchw.Lookify.Repository.LookifyRepository;

@Service
public class LookifyServices {

	private final LookifyRepository lookifyRepository;
	
	//private List<Song> songs;
	
	public LookifyServices(LookifyRepository lookifyRepository){
		
		this.lookifyRepository = lookifyRepository;
		//this.songs = this.lookifyRepository.findAll();
	}
	
	
	public List<Song> allSongsInRepo(){
		
		return this.lookifyRepository.findAll();
	}
	
	public Song createSongInRepo(Song song) {
		
		return this.lookifyRepository.save(song);
	}
	
	public Optional<Song> getSongById(Long id) {
		
		return this.lookifyRepository.findById(id);
	}
	
	
	
//	public List<Song> findSongInRepoBySinger(String singer) {
//		
//		return this.lookifyRepository.findByDescriptionContaining(singer);
//	}
	
	public void deleteSongInRepo(Long id) {
		
		this.lookifyRepository.deleteById(id);
	}
	
	public List<Song> songsContainingArtist(String artist) {
		return this.lookifyRepository.findByArtistContaining(artist);
	}
	
	public List<Song> songsTopTen() {
		return this.lookifyRepository.findTop10ByOrderByRatingDesc();
	}
	
	
	
}
