package com.chengchw.DojoOverflow.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chengchw.DojoOverflow.Model.Answer;


@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{
	
	List<Answer> findAll();

}
