package br.com.kopzinski.service;

import java.util.Date;
import java.util.List;

import br.com.kopzinski.beans.Candidate;
import br.com.kopzinski.beans.Day;
import br.com.kopzinski.beans.Election;
import br.com.kopzinski.beans.Place;
import br.com.kopzinski.beans.User;
import br.com.kopzinski.exception.DuplicatedVoteException;
import br.com.kopzinski.mock.Mocks;

public class LunchService {
	
//	private Election election;
	private List<Election> elections;
	
	public LunchService() {
		elections = Mocks.populateElections();
	}

	public void vote(User user, Place place, Date day) throws DuplicatedVoteException {
		Election election = findElectionByDay(day);
		if(election == null) {
			election = new Election();
		}
		
		
		for(Candidate candidate : election.getCandidates()){
			if(candidate.getPlace().equals(place)){
				candidate.getVoters().add(user);
			}
		}
	}

	public int countVotes(Place place, Date day) {
		Election election = findElectionByDay(day);
		Candidate candidate = getCandidateOfElectionByPlace(election, place);
		return candidate.getVotes();
	}

	public Place getWinner(Date day) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Election findElectionByDay(Date day) {
		for (Election e : elections) {
			if(e.getDay().equals(day))
				return e;
		}
		return null;
	}
	
	private Candidate getCandidateOfElectionByPlace(Election election, Place place) {
		for (Candidate candidate : election.getCandidates()) {
			if(candidate.getPlace().equals(place)){
				return candidate;
			}
		}
		return null;
	}

}
