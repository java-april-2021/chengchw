package com.chengchw.DojoOverflow.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.chengchw.DojoOverflow.Model.Question;
import com.chengchw.DojoOverflow.Repository.QuestionRepository;

@Service
public class QuestionService {
	
	private final QuestionRepository quesrepo;
	
	public QuestionService(QuestionRepository quesrepo) {
		
		this.quesrepo = quesrepo;
	}
	
	public List<Question> getallquestions(){
		
		return this.quesrepo.findAll();
	}
	
	public Question findquestionbyid(Long Id) {
		
		return this.quesrepo.findById(Id).get();
	}
	
	public Question setquestion(Question newquestion) {
		
		return this.quesrepo.save(newquestion);
	}
}
