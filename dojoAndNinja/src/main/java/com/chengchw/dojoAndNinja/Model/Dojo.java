package com.chengchw.dojoAndNinja.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "dojos")
public class Dojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Date create_at;
	private Date update_at;
	
	
	
	@OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
	private List<Ninja> ninjas;
	
	public Dojo() {}

	public Dojo(String name) {
		
		this.name = name;
		//this.ninjas = ninjas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

	public List<Ninja> getNinjas() {
		return ninjas;
	}

	public void setNinja(Ninja ninja) {
		this.ninjas.add(ninja);
	}
	
	
	
}
	