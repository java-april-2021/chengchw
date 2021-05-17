package com.chengchw.DojoOverflow.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chengchw.DojoOverflow.Model.Answer;
import com.chengchw.DojoOverflow.Repository.AnswerRepository;

@Service
public class AnswerService {
	
	private final AnswerRepository ansRepo;
	
	public AnswerService(AnswerRepository ansRepo) {
		
		this.ansRepo = ansRepo;
	}
	
	public List<Answer> getAllAns(){
		
		return this.ansRepo.findAll();
	}

	public Answer updateAns(Answer newAnswer) {
		
		return this.ansRepo.save(newAnswer);
	}
}
