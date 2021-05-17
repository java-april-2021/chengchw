package com.chengchw.DojoOverflow.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.DojoOverflow.Repository.TagRepository;
import com.chengchw.DojoOverflow.Model.Tag;

@Service
public class TagService {
	
	private final TagRepository tagrepo;
	
	public TagService(TagRepository tagrepo) {
		
		this.tagrepo = tagrepo;
	}
	
	public List<Tag> getalltag(){
		
		return this.tagrepo.findAll();
	}
	
	public Tag saveTag(Tag newtag) {
		
		return this.tagrepo.save(newtag);
	}
}
