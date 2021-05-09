package com.chengchw.dojoAndNinja.Service;

import org.springframework.stereotype.Service;

import com.chengchw.dojoAndNinja.Repository.DojoRepository;

import java.util.List;
import com.chengchw.dojoAndNinja.Model.Dojo;

@Service
public class DojoService {
	
	private final DojoRepository dojorepo;
	
	public DojoService(DojoRepository dojorepo) {
		
		this.dojorepo = dojorepo;
	}
	
	
	public List<Dojo> getAllDojo() {
		
		return this.dojorepo.findAll();
	}
	
	public Dojo ceateDojo(Dojo newdojo) {
		
		return this.dojorepo.save(newdojo);
	}
	
	public Dojo getDojoById(Long Id) {
		
		return this.dojorepo.findById(Id).get();
	}
}
