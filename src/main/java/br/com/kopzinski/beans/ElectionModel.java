package br.com.kopzinski.beans;

import java.util.Date;
import java.util.List;

import br.com.kopzinski.mock.Mocks;

public class ElectionModel {
	



//	public ElectionModel() {
//		Mocks.populateElections();
//	}
	
	public Election getElectionFromDay(Date day){
		List<Election> elections = Mocks.populateElections();
		for (Election election : elections) {
			if(election.getDay().equals(day)){
				return election;
			}
		}
		 
		return null;
		
	}

}
