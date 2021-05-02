package com.chengchw.Language.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.Language.Repository.LanguageRepository;
import com.chengchw.Language.models.Language;

@Service
public class LanguageService {
	
	private final LanguageRepository languageRepository;
	
	private List<Language> languages = new ArrayList(Arrays.asList(new Language("Java", "James Gosling", "1.8"),
																   new Language("Java", "James Gosling", "1.8")));
	
	public LanguageService( LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}
	
	
	public List<Language> allLanguages(){
		
		return this.languages;
	}
	
	public Language findLanguageByIndex(int index) {
		
		if(index < languages.size()) {
			
			return this.languages.get(index);
		}
		
		else {
			
			return null;
		}
	}
	
	public void editLanguage(int index, Language language) {
		
		if(index < languages.size()) {
			
			this.languages.set(index,language);
		}
	}
	
	public void deleteLanguage(int index) {
		
		if(index < languages.size()) {
			
			this.languages.remove(index);
		}
	}
	
		
		
		
	
	
	

}
