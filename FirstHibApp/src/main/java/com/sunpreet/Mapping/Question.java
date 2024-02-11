package com.sunpreet.Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id
	private int ques_id;
	private String ques;
	@OneToOne
	//@JoinColumn(name = "answer")							// @JoinColumn(name= "answers") is being used to change name of the column
	private Answer ans;
	
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public int getQues_id() {
		return ques_id;
	}
	public void setQues_id(int ques_id) {
		this.ques_id = ques_id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	
	

}
