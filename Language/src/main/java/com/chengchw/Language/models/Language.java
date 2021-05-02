package com.chengchw.Language.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name = "languages")

public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 3, max = 200)
	private String Name;
	
	@Size(min = 5, max = 200)
	private String Creator;
	
	@Size(min = 0)
	private String Version;

	public Language(@Size(min = 3, max = 200) String name, 
					@Size(min = 5, max = 200) String creator,
					@Size(min = 0) String version) {
		Name = name;
		Creator = creator;
		Version = version;
	}
	
	public Language() {}

	public Long getId() {
		
		return this.id;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCreator() {
		return Creator;
	}

	public void setCreator(String creator) {
		Creator = creator;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}
	
	
	
	
	
	
	
	
}
