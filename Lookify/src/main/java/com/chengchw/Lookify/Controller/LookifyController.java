package com.chengchw.Lookify.Controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chengchw.Lookify.Models.Song;
import com.chengchw.Lookify.Services.LookifyServices;

@Controller
public class LookifyController {

		private final LookifyServices lookifyServices;
		
		//private List<Song> Songs; 
		
		public LookifyController(LookifyServices lookifyServices) {
			this.lookifyServices = lookifyServices;
			//this.Songs = lookifyServices.allSongsInRepo();
		}
		
		
		@RequestMapping("/")
		public String index() {
			
			return "index.jsp";
		}
		
		@RequestMapping("/dashboard")
		public String dashboard(Model model) {
			System.out.println("apple");
			List<Song> songs = this.lookifyServices.allSongsInRepo();
			model.addAttribute("Songs", songs);
			System.out.println(songs);
			return "dashboard.jsp";
		}
		
		@RequestMapping("/songs/new")
		public String createNewSongPage(@ModelAttribute("song") Song song) {
	
			return "newsong.jsp";
			
		}
		
		@RequestMapping(path ="/create", method = RequestMethod.POST)
		public String createNewSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
			
			if(result.hasErrors()) {
	    		System.out.println("error");	
	    		return "newsong.jsp";
	    	}
	    	
	    	else { 
	    		
	    		this.lookifyServices.createSongInRepo(song);
	    		
	    		return "redirect:/dashboard";
	    	}
					
		}
		
		@RequestMapping("/delete/{id}")
		public String deleteSong(@PathVariable(value = "id") Long id) {
			
			this.lookifyServices.deleteSongInRepo(id);
			
			return "redirect:/dashboard";
			
			
		}
		
		@RequestMapping("/song/{id}")
		public String getSongPage(Model model,@PathVariable(value = "id") Long id) {
			
			Song song = this.lookifyServices.getSongById(id).get();
			//System.out.println(song);
			model.addAttribute("song", song);
			
			
			return "songpage.jsp";
		}	
			
		
		
		@RequestMapping("/search")
		public String searchArtistPage(Model model, @RequestParam("artist") String artist) {
			//System.out.println(artist);
			List<Song> songs = this.lookifyServices.songsContainingArtist(artist);
			model.addAttribute("songs", songs);
			model.addAttribute("artist",artist);
			//System.out.println(songs);
			return "searchsinger.jsp";
			
			
		}
		
		@RequestMapping("/topTen")
		public String searchTopTen(Model model) {
			
			List<Song> songs = this.lookifyServices.songsTopTen();
			
			
			//System.out.println(songs.sort(null));
			//Comparator<Song> compareByRating = (Song song, Song song2) -> Integer.valueOf(song.getRating()).compareTo(Integer.valueOf(song2.getRating()));
			//Collections.sort(songs, compareByRating);
			model.addAttribute("songs", songs);
			
			for (int i = 0; i < songs.size(); i++) {
				System.out.print(songs.get(i).getTitle()+"\n");
				System.out.print(songs.get(i).getRating()+"\n");
				
			}
			return "toptenpage.jsp";
			
			
		}
		
		
		
}
