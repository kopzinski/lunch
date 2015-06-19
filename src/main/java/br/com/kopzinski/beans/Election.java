package br.com.kopzinski.beans;

import java.util.Date;
import java.util.List;

public class Election {
	private Date day;
	private List<Candidate> candidates;
	
//	static private Election instance;
//	
//	public static Election getInstance(){
//		if(instance == null)
//			return new Election();
//		return instance;
//	}
	
	public void vote(Place place, User voter) {
		
	}
	
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public List<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	
	
}
