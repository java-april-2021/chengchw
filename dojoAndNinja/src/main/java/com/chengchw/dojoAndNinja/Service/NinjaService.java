package com.chengchw.dojoAndNinja.Service;

import org.springframework.stereotype.Service;

import com.chengchw.dojoAndNinja.Model.Ninja;
import com.chengchw.dojoAndNinja.Repository.NinjaRepository;
import java.util.List;


@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepo;
	
	
	
	
	public NinjaService(NinjaRepository ninjaRepo) {
		
		this.ninjaRepo = ninjaRepo;
	}
	
	//public NinjaService() {}
	
	
	  public List<Ninja> getAllNinja(){
	  
	  return this.ninjaRepo.findAll();
	  
	  }
	 

	public Ninja createNinja(Ninja newNinja) {
		
		return this.ninjaRepo.save(newNinja);
	}
	
	
}
