package com.chengchw.DojoOverflow.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 5, max = 200)
	private String question;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY)
	private List<Answer> answers; 
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tags_questions", joinColumns = @JoinColumn(name = "question_id"), 
			   inverseJoinColumns = @JoinColumn(name = "tag_id"))
	
	private List<Tag> tags;
	
	
	public Question() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public String getTagsString() {
		
		String blankTagString = "";
		
		for (int i = 0; i < this.tags.size(); i++) {
			
			blankTagString += this.tags.get(i).getSubject();
			blankTagString += ", ";
			
		}
		
		return blankTagString;
	}
	
	
	
	
	

}
