package com.chengchw.Lookify.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "songs")
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 5, max = 200)
	private String title;
	@Size(min = 5, max = 200)
	private String artist;
	@Max(10)
	@Min(1)
	private int rating;
	public Song(@Size(min = 5, max = 200) String title, @Size(min = 5, max = 200) String artist,
			@Max(10) @Min(1) int rating) {
		
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}
	
	public Song() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
//	@Override
//	public int compareTo(Song song) {
//        return this.getRating().compareTo(song.getRating());
//    }
	
	
	
	
}
