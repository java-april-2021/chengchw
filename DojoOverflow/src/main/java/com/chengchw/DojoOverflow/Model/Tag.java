package com.chengchw.DojoOverflow.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String subject;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tags_questions", joinColumns = @JoinColumn(name = "tag_id"), 
			   inverseJoinColumns = @JoinColumn(name = "question_id"))
	
	private List<Question> questions;
	
	public Tag() {}
	
	public Tag(String subject) {
		
		this.subject = subject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public void setSingleQuestion(Question newquestion) {
		
		if (this.questions == null) {
			
			List<Question> newqueslist = new ArrayList<Question>();
			newqueslist.add(newquestion);
			this.setQuestions(newqueslist);
		}
		
		else {
			this.questions.add(newquestion);
		}
		
		
	}
	
	
	
}
