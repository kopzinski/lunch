package br.com.kopzinski.beans;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
	private Place place;
	private List<User> voters;

	public Candidate() {
		voters = new ArrayList<>();
	}
	
	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public List<User> getVoters() {
		return voters;
	}

	public void setVoters(List<User> voters) {
		this.voters = voters;
	}
	
	public int getVotes() {
		return voters.size();
	}
	
}
