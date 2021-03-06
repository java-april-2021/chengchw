package com.chengchw.DojoOverflow.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.chengchw.DojoOverflow.Model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{
	
	List<Tag> findAll();

}
